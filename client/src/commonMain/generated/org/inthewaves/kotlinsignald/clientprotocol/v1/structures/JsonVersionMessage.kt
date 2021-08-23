package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.Serializable

@Serializable
public data class JsonVersionMessage(
    /**
     * Example: "signald"
     */
    public val name: String? = null,
    /**
     * Example: "0.14.1+git2021-08-22re1249449.26"
     */
    public val version: String? = null,
    /**
     * Example: "main"
     */
    public val branch: String? = null,
    /**
     * Example: "e124944992edfeb3e7ca2822580eab29b4be79f5"
     */
    public val commit: String? = null
) : SignaldResponseBodyV1()
