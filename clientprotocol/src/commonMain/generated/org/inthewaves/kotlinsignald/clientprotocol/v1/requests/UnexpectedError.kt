// File is generated by ./gradlew generateSignaldClasses --- do not edit unless reformatting
package org.inthewaves.kotlinsignald.clientprotocol.v1.requests

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
@SerialName("unexpected_error")
internal data class UnexpectedError private constructor(
    public override val data: JsonObject? = null
) : JsonMessageWrapper<JsonObject>()