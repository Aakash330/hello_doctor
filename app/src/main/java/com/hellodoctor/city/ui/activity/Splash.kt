package com.hellodoctor.city.ui.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hellodoctor.city.R

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

/*
    private fun addGifStickerToWhatsApp(contentUri: Uri) {
        val stickerPackProvider = ContentProviderUriUtils.getStickerPackContentProviderUri(this, "com.example.stickers")
        val stickerPackWhitelistCheck = StickerPackValidator.validateStickerPackWhitelistedAndInstalled(stickerPackProvider, contentResolver)

        if (stickerPackWhitelistCheck.isWhitelisted) {
            val stickerPackIntent = Intent().apply {
                action = "com.whatsapp.intent.action.ENABLE_STICKER_PACK"
                putExtra("sticker_pack_id", "com.example.stickers")
                putExtra("sticker_pack_authority", stickerPackProvider.authority)
                putExtra("sticker_pack_name", "My Sticker Pack")
                putExtra("sticker_pack_publisher", "My Publisher")
                putExtra("sticker_pack_icon_content_type", "image/webp")
                putExtra("sticker_pack_icon_file_name", "tray_image.webp")
                putExtra("sticker_pack_cover_image_content_type", "image/webp")
                putExtra("sticker_pack_cover_image_file_name", "tray_image.webp")
                putExtra("sticker_pack_has_animation", true)
            }
            startActivity(stickerPackIntent)
        } else {
            Toast.makeText(this, "Sticker pack is not whitelisted", Toast.LENGTH_SHORT).show()
        }

        // Add the GIF sticker to the WhatsApp sticker tray
        val stickerPackContentUri = ContentProviderUriUtils.getStickerPackContentProviderUri(this, "com.example.stickers")
        val stickerUri = ContentProviderUriUtils.getStickerAssetUri(stickerPackContentUri, "sticker.gif")
        contentResolver.openOutputStream(stickerUri)?.use { outputStream ->
            contentResolver.openInputStream(contentUri)?.use { inputStream ->
                inputStream.copyTo(outputStream)
            }
        }
    }
*/

}