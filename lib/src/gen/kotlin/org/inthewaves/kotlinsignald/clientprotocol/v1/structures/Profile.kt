package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Generated from signald version 0.14.1+git2021-08-13r7dde35de.21
 *
 * Information about a Signal user
 */
@Serializable
public data class Profile(
    /**
     * The user's name from local contact names if available, or if not in contact list their Signal
     * profile name
     */
    public val name: String? = null,
    /**
     * path to avatar on local disk
     */
    public val avatar: String? = null,
    public val address: JsonAddress? = null,
    public val capabilities: Capabilities? = null,
    /**
     * color of the chat with this user
     */
    public val color: String? = null,
    public val about: String? = null,
    public val emoji: String? = null,
    /**
     * The user's Signal profile name
     */
    @SerialName("profile_name")
    public val profileName: String? = null,
    @SerialName("inbox_position")
    public val inboxPosition: Int? = null,
    @SerialName("expiration_time")
    public val expirationTime: Int? = null,
    /**
     * *base64-encoded* mobilecoin address. Note that this is not the traditional MobileCoin address
     * encoding. Clients are responsible for converting between MobileCoin's custom base58 on the
     * user-facing side and base64 encoding on the signald side. If unset, null or an empty string,
     * will empty the profile payment address
     */
    @SerialName("mobilecoin_address")
    public val mobilecoinAddress: String? = null
) : SignaldResponseBodyV1()
