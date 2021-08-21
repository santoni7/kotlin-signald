package org.inthewaves.kotlinsignald.clientprotocol.v0.structures

import kotlinx.serialization.Serializable

@Serializable
@Deprecated("Will be removed on Sat, 1 Jan 2022 09:01:01 GMT")
public data class JsonSticker(
    public val packID: String? = null,
    public val packKey: String? = null,
    public val stickerID: Int? = null,
    public val attachment: JsonAttachment? = null,
    public val image: String? = null
)
