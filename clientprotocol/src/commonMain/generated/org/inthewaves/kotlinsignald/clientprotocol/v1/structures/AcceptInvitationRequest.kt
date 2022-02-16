// File is generated by ./gradlew generateSignaldClasses --- do not edit unless reformatting
package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.inthewaves.kotlinsignald.clientprotocol.SocketCommunicator
import org.inthewaves.kotlinsignald.clientprotocol.SuspendSocketCommunicator
import org.inthewaves.kotlinsignald.clientprotocol.v1.requests.AcceptInvitation
import org.inthewaves.kotlinsignald.clientprotocol.v1.requests.JsonMessageWrapper

/**
 * Accept a v2 group invitation. Note that you must have a profile name set to join groups.
 */
@Serializable
@SerialName("accept_invitation")
public data class AcceptInvitationRequest(
    /**
     * The account to interact with
     *
     * Example: "+12024561414"
     */
    public val account: String,
    /**
     * Example: "EdSqI90cS0UomDpgUXOlCoObWvQOXlH5G3Z2d3f4ayE="
     */
    public val groupID: String
) : SignaldRequestBodyV1<JsonGroupV2Info>() {
    internal override val responseWrapperSerializer: KSerializer<AcceptInvitation>
        get() = AcceptInvitation.serializer()

    internal override val responseDataSerializer: KSerializer<JsonGroupV2Info>
        get() = JsonGroupV2Info.serializer()

    internal override fun getTypedResponseOrNull(responseWrapper: JsonMessageWrapper<*>):
        JsonGroupV2Info? = if (responseWrapper is AcceptInvitation && responseWrapper.data is
        JsonGroupV2Info
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
     * @throws NoSuchAccountError
     * @throws OwnProfileKeyDoesNotExistError
     * @throws ServerNotFoundError
     * @throws InvalidProxyError
     * @throws UnknownGroupError
     * @throws InternalError
     * @throws InvalidRequestError
     * @throws AuthorizationFailedError
     */
    public override fun submit(socketCommunicator: SocketCommunicator, id: String): JsonGroupV2Info =
        super.submit(socketCommunicator, id)

    /**
     * @throws org.inthewaves.kotlinsignald.clientprotocol.RequestFailedException if the signald
     * socket sends a bad or error response, or unable to serialize our request
     * @throws org.inthewaves.kotlinsignald.clientprotocol.SignaldException if an I/O error occurs
     * during socket communication
     * @throws NoSuchAccountError
     * @throws OwnProfileKeyDoesNotExistError
     * @throws ServerNotFoundError
     * @throws InvalidProxyError
     * @throws UnknownGroupError
     * @throws InternalError
     * @throws InvalidRequestError
     * @throws AuthorizationFailedError
     */
    public override suspend fun submitSuspend(
        socketCommunicator: SuspendSocketCommunicator,
        id: String
    ): JsonGroupV2Info = super.submitSuspend(socketCommunicator, id)
}
