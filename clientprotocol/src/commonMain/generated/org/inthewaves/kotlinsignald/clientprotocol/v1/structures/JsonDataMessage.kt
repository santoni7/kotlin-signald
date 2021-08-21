package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.inthewaves.kotlinsignald.clientprotocol.v0.structures.JsonAttachment
import org.inthewaves.kotlinsignald.clientprotocol.v0.structures.JsonPreview
import org.inthewaves.kotlinsignald.clientprotocol.v0.structures.JsonSticker
import org.inthewaves.kotlinsignald.clientprotocol.v0.structures.SharedContact

@Serializable
public data class JsonDataMessage(
    /**
     * the timestamp that the message was sent at, according to the sender's device. This is used to
     * uniquely identify this message for things like reactions and quotes.
     * Example: 1615576442475
     */
    public val timestamp: Long? = null,
    /**
     * files attached to the incoming message
     */
    public val attachments: List<JsonAttachment> = emptyList(),
    /**
     * the text body of the incoming message.
     * Example: "hello"
     */
    public val body: String? = null,
    /**
     * if the incoming message was sent to a v1 group, information about that group will be here
     */
    public val group: JsonGroupInfo? = null,
    /**
     * if the incoming message was sent to a v2 group, basic identifying information about that
     * group will be here. If group information changes, JsonGroupV2Info.revision is incremented. If
     * the group revision is higher than previously seen, a client can retrieve the group information
     * by calling get_group.
     */
    public val groupV2: JsonGroupV2Info? = null,
    public val endSession: Boolean? = null,
    /**
     * the expiry timer on the incoming message. Clients should delete records of the message within
     * this number of seconds
     */
    public val expiresInSeconds: Int? = null,
    public val profileKeyUpdate: Boolean? = null,
    /**
     * if the incoming message is a quote or reply to another message, this will contain information
     * about that message
     */
    public val quote: JsonQuote? = null,
    /**
     * if the incoming message has a shared contact, the contact's information will be here
     */
    public val contacts: List<SharedContact> = emptyList(),
    /**
     * if the incoming message has a link preview, information about that preview will be here
     */
    public val previews: List<JsonPreview> = emptyList(),
    /**
     * if the incoming message is a sticker, information about the sicker will be here
     */
    public val sticker: JsonSticker? = null,
    /**
     * indicates the message is a view once message. View once messages typically include no body
     * and a single image attachment. Official Signal clients will prevent the user from saving the
     * image, and once the user has viewed the image once they will destroy the image.
     */
    public val viewOnce: Boolean? = null,
    /**
     * if the message adds or removes a reaction to another message, this will indicate what change
     * is being made
     */
    public val reaction: JsonReaction? = null,
    /**
     * if the inbound message is deleting a previously sent message, indicates which message should
     * be deleted
     */
    public val remoteDelete: RemoteDelete? = null,
    /**
     * list of mentions in the message
     */
    public val mentions: List<JsonMention> = emptyList(),
    /**
     * details about the MobileCoin payment attached to the message, if present
     */
    public val payment: Payment? = null,
    /**
     * the eraId string from a group call message update
     */
    @SerialName("group_call_update")
    public val groupCallUpdate: String? = null
)
