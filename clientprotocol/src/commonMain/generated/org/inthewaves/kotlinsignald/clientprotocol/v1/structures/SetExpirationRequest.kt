// File is generated by ./gradlew generateSignaldClasses --- do not edit unless reformatting
package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.inthewaves.kotlinsignald.clientprotocol.SocketCommunicator
import org.inthewaves.kotlinsignald.clientprotocol.SuspendSocketCommunicator
import org.inthewaves.kotlinsignald.clientprotocol.v1.requests.JsonMessageWrapper
import org.inthewaves.kotlinsignald.clientprotocol.v1.requests.SetExpiration

/**
 * Set the message expiration timer for a thread. Expiration must be specified in seconds, set to 0
 * to disable timer
 */
@Serializable
@SerialName("set_expiration")
public data class SetExpirationRequest(
    /**
     * The account to use
     *
     * Example: "+12024561414"
     */
    public val account: String,
    public val address: JsonAddress? = null,
    /**
     * Example: "EdSqI90cS0UomDpgUXOlCoObWvQOXlH5G3Z2d3f4ayE="
     */
    public val group: String? = null,
    /**
     * Example: 604800
     */
    public val expiration: Int
) : SignaldRequestBodyV1<SendResponse>() {
    internal override val responseWrapperSerializer: KSerializer<SetExpiration>
        get() = SetExpiration.serializer()

    internal override val responseDataSerializer: KSerializer<SendResponse>
        get() = SendResponse.serializer()

    internal override fun getTypedResponseOrNull(responseWrapper: JsonMessageWrapper<*>):
        SendResponse? = if (responseWrapper is SetExpiration && responseWrapper.data is
        SendResponse
    ) {
        responseWrapper.data
    } else {
        null
    }

    /**
     * @throws org.inthewaves.kotlinsignald.clientprotocol.RequestFailedException if the signald
     * socket sends a bad or error response, or unable to serialize our request
     * @throws org.inthewaves.kotlinsignald.clientprotocol.SignaldException if an I/O error occurs
     * during socket communication
     * @throws InternalError
     * @throws InvalidProxyError
     * @throws ServerNotFoundError
     * @throws NoSuchAccountError
     * @throws UnknownGroupError
     * @throws GroupVerificationError
     * @throws InvalidRequestError
     * @throws AuthorizationFailedError
     * @throws UnregisteredUserError
     */
    public override fun submit(socketCommunicator: SocketCommunicator, id: String): SendResponse =
        super.submit(socketCommunicator, id)

    /**
     * @throws org.inthewaves.kotlinsignald.clientprotocol.RequestFailedException if the signald
     * socket sends a bad or error response, or unable to serialize our request
     * @throws org.inthewaves.kotlinsignald.clientprotocol.SignaldException if an I/O error occurs
     * during socket communication
     * @throws InternalError
     * @throws InvalidProxyError
     * @throws ServerNotFoundError
     * @throws NoSuchAccountError
     * @throws UnknownGroupError
     * @throws GroupVerificationError
     * @throws InvalidRequestError
     * @throws AuthorizationFailedError
     * @throws UnregisteredUserError
     */
    public override suspend fun submitSuspend(
        socketCommunicator: SuspendSocketCommunicator,
        id: String
    ): SendResponse = super.submitSuspend(socketCommunicator, id)
}
