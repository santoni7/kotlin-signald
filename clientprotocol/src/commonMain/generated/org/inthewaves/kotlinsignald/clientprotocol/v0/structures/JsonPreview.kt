package org.inthewaves.kotlinsignald.clientprotocol.v0.structures

import kotlinx.serialization.Serializable

@Serializable
@Deprecated("Will be removed on Sat, 1 Jan 2022 09:01:01 GMT")
public data class JsonPreview(
    public val url: String? = null,
    public val title: String? = null,
    public val attachment: JsonAttachment? = null
)
