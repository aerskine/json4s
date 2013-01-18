package org.json4s

import language.experimental.macros


object Macros {
  type ParamsTpe = playground.ValueProvider[_]
  def serialize[U](obj:U, name:String, writer: macroimpls.Serializer.Writer) = macro macroimpls.Serializer.impl[U]
  
  def deserialize[U](params: ParamsTpe,name:String) = macro macroimpls.Deserializer.classbuilder[U]

}