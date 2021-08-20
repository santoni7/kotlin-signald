package org.inthewaves.kotlinsignald.clientprotocol.v1.structures

import kotlinx.serialization.Serializable

/**
 * Generated from signald version 0.14.1+git2021-08-13r7dde35de.21
 *
 * Information about a Signal group
 */
@Serializable
public data class JsonGroupV2Info(
    /**
     * Example: "EdSqI90cS0UomDpgUXOlCoObWvQOXlH5G3Z2d3f4ayE="
     */
    public val id: String? = null,
    /**
     * Example: 5
     */
    public val revision: Int? = null,
    /**
     * Example: "Parkdale Run Club"
     */
    public val title: String? = null,
    public val description: String? = null,
    /**
     * path to the group's avatar on local disk, if available
     * Example: "/var/lib/signald/avatars/group-EdSqI90cS0UomDpgUXOlCoObWvQOXlH5G3Z2d3f4ayE="
     */
    public val avatar: String? = null,
    /**
     * Example: 604800
     */
    public val timer: Int? = null,
    public val members: List<JsonAddress> = emptyList(),
    public val pendingMembers: List<JsonAddress> = emptyList(),
    public val requestingMembers: List<JsonAddress> = emptyList(),
    /**
     * the signal.group link, if applicable
     */
    public val inviteLink: String? = null,
    /**
     * current access control settings for this group
     */
    public val accessControl: GroupAccessControl? = null,
    /**
     * detailed member list
     */
    public val memberDetail: List<GroupMember> = emptyList(),
    /**
     * detailed pending member list
     */
    public val pendingMemberDetail: List<GroupMember> = emptyList()
) : SignaldResponseBodyV1()
