package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Generated from signald version 0.14.1+git2021-08-13r7dde35de.21
 */
@Serializable
@SerialName("IncomingMessage")
public data class IncomingMessage(
    public override val version: String? = null,
    public override val `data`: Data,
    public override val error: Boolean? = false
) : ClientMessageWrapper() {
    @Serializable
    public data class Data(
        /**
         * Example: "+12024561414"
         */
        public val account: String? = null,
        public val source: JsonAddress? = null,
        public val type: String? = null,
        /**
         * Example: 1615576442475
         */
        public val timestamp: Long? = null,
        @SerialName("source_device")
        public val sourceDevice: Int? = null,
        /**
         * Example: 1615576442475
         */
        @SerialName("server_receiver_timestamp")
        public val serverReceiverTimestamp: Long? = null,
        /**
         * Example: 1615576442475
         */
        @SerialName("server_deliver_timestamp")
        public val serverDeliverTimestamp: Long? = null,
        @SerialName("has_legacy_message")
        public val hasLegacyMessage: Boolean? = null,
        @SerialName("has_content")
        public val hasContent: Boolean? = null,
        @SerialName("unidentified_sender")
        public val unidentifiedSender: Boolean? = null,
        @SerialName("data_message")
        public val dataMessage: JsonDataMessage? = null,
        @SerialName("sync_message")
        public val syncMessage: JsonSyncMessage? = null,
        @SerialName("call_message")
        public val callMessage: CallMessage? = null,
        @SerialName("receipt_message")
        public val receiptMessage: ReceiptMessage? = null,
        @SerialName("typing_message")
        public val typingMessage: TypingMessage? = null,
        @SerialName("server_guid")
        public val serverGuid: String? = null
    ) : ClientMessageWrapper.Data()
}
