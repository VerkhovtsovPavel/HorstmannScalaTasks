import scala.collection.mutable

object Main extends App {
  val point = new java.awt.Point(1,1) with PropertyChangeSupport {
    override def source: Any = this
  }
}

import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener


trait PropertyChangeSupport {
  val map = new mutable.HashMap[String, Array[PropertyChangeListener]]()

  def source : Any

  val serialVersionUID = 6401253773779951803L

  def getPropertyChangeListeners: Array[PropertyChangeListener] = map.values.toArray.flatten

  def addPropertyChangeListener(propertyName : String, listener : PropertyChangeListener) {
      if(listener != null) {
        val listeners = map.getOrElse(propertyName, new Array[PropertyChangeListener](0))
        listeners.+:(listener)
        map.put(propertyName, listeners)
      }
   }

  def removePropertyChangeListener(propertyName : String, listener : PropertyChangeListener) {
      if(listener != null) {
        map.get(propertyName).get.dropWhile(_.eq(listener))
      }
  }

  def firePropertyChange(propertyName : String , oldValue : Any, newValue : Any) {
    if(oldValue == null || newValue == null || !oldValue.equals(newValue)) {
      firePropertyChange(new PropertyChangeEvent(source, propertyName, oldValue, newValue))
    }
  }

  def firePropertyChange(event : PropertyChangeEvent) {
    val oldValue = event.getOldValue
    val newValue = event.getNewValue
    if(oldValue == null || newValue == null || !oldValue.equals(newValue)) {
      val name = event.getPropertyName
      val common = map.get(null).get
      val named = if (name != null) map.get(name).get  else null
      fire(common, event)
      fire(named, event)
    }
  }

  private def fire(listeners : Array[PropertyChangeListener], event : PropertyChangeEvent) {
    if(listeners != null) {
      for(listener <- listeners)
        listener.propertyChange(event)
    }
  }
}