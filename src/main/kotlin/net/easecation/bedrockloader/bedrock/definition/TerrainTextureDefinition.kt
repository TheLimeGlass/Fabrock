package net.easecation.bedrockloader.bedrock.definition

data class TerrainTextureDefinition(
        val resource_pack_name: String?,
        val texture_name: String?,
        val padding: Int?,
        val num_mip_levels: Int?,
        val texture_data: Map<String, TextureData>
) {
    data class TextureData(
            val textures: String
    )
}