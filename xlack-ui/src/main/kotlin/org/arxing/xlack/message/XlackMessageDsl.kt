package org.arxing.xlack.message

fun xlackMessage(builder: XlackMessage.Builder.() -> Unit): XlackMessage {
  return XlackMessage.Builder().also(builder).build()
}
