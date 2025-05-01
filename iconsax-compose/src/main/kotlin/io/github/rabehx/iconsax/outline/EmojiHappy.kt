/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.EmojiHappy: ImageVector
    get() {
        if (_EmojiHappy != null) {
            return _EmojiHappy!!
        }
        _EmojiHappy = ImageVector.Builder(
            name = "Outline.EmojiHappy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 10.5f)
                curveTo(14.26f, 10.5f, 13.25f, 9.49f, 13.25f, 8.25f)
                curveTo(13.25f, 7.01f, 14.26f, 6f, 15.5f, 6f)
                curveTo(16.74f, 6f, 17.75f, 7.01f, 17.75f, 8.25f)
                curveTo(17.75f, 9.49f, 16.74f, 10.5f, 15.5f, 10.5f)
                close()
                moveTo(15.5f, 7.5f)
                curveTo(15.09f, 7.5f, 14.75f, 7.84f, 14.75f, 8.25f)
                curveTo(14.75f, 8.66f, 15.09f, 9f, 15.5f, 9f)
                curveTo(15.91f, 9f, 16.25f, 8.66f, 16.25f, 8.25f)
                curveTo(16.25f, 7.84f, 15.91f, 7.5f, 15.5f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 10.5f)
                curveTo(7.26f, 10.5f, 6.25f, 9.49f, 6.25f, 8.25f)
                curveTo(6.25f, 7.01f, 7.26f, 6f, 8.5f, 6f)
                curveTo(9.74f, 6f, 10.75f, 7.01f, 10.75f, 8.25f)
                curveTo(10.75f, 9.49f, 9.74f, 10.5f, 8.5f, 10.5f)
                close()
                moveTo(8.5f, 7.5f)
                curveTo(8.09f, 7.5f, 7.75f, 7.84f, 7.75f, 8.25f)
                curveTo(7.75f, 8.66f, 8.09f, 9f, 8.5f, 9f)
                curveTo(8.91f, 9f, 9.25f, 8.66f, 9.25f, 8.25f)
                curveTo(9.25f, 7.84f, 8.91f, 7.5f, 8.5f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.45f)
                curveTo(9.1f, 19.45f, 6.75f, 17.09f, 6.75f, 14.2f)
                curveTo(6.75f, 13.29f, 7.49f, 12.55f, 8.4f, 12.55f)
                horizontalLineTo(15.6f)
                curveTo(16.51f, 12.55f, 17.25f, 13.29f, 17.25f, 14.2f)
                curveTo(17.25f, 17.09f, 14.9f, 19.45f, 12f, 19.45f)
                close()
                moveTo(8.4f, 14.05f)
                curveTo(8.32f, 14.05f, 8.25f, 14.12f, 8.25f, 14.2f)
                curveTo(8.25f, 16.27f, 9.93f, 17.95f, 12f, 17.95f)
                curveTo(14.07f, 17.95f, 15.75f, 16.27f, 15.75f, 14.2f)
                curveTo(15.75f, 14.12f, 15.68f, 14.05f, 15.6f, 14.05f)
                horizontalLineTo(8.4f)
                close()
            }
        }.build()

        return _EmojiHappy!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiHappy: ImageVector? = null
