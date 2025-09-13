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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.EmojiSad: ImageVector
    get() {
        if (_EmojiSad != null) {
            return _EmojiSad!!
        }
        _EmojiSad = ImageVector.Builder(
            name = "Filled.EmojiSad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(6.47f, 9.28f)
                curveTo(6.18f, 8.99f, 6.18f, 8.51f, 6.47f, 8.22f)
                curveTo(7.76f, 6.93f, 9.87f, 6.93f, 11.17f, 8.22f)
                curveTo(11.46f, 8.51f, 11.46f, 8.99f, 11.17f, 9.28f)
                curveTo(11.02f, 9.43f, 10.83f, 9.5f, 10.64f, 9.5f)
                curveTo(10.45f, 9.5f, 10.26f, 9.43f, 10.11f, 9.28f)
                curveTo(9.4f, 8.57f, 8.24f, 8.57f, 7.53f, 9.28f)
                curveTo(7.24f, 9.58f, 6.76f, 9.58f, 6.47f, 9.28f)
                close()
                moveTo(15.6f, 18.08f)
                horizontalLineTo(8.4f)
                curveTo(7.7f, 18.08f, 7.13f, 17.51f, 7.13f, 16.8f)
                curveTo(7.13f, 14.11f, 9.32f, 11.92f, 12.01f, 11.92f)
                curveTo(14.7f, 11.92f, 16.89f, 14.11f, 16.89f, 16.8f)
                curveTo(16.88f, 17.5f, 16.3f, 18.08f, 15.6f, 18.08f)
                close()
                moveTo(17.53f, 9.28f)
                curveTo(17.24f, 9.57f, 16.76f, 9.57f, 16.47f, 9.28f)
                curveTo(15.76f, 8.57f, 14.6f, 8.57f, 13.89f, 9.28f)
                curveTo(13.74f, 9.43f, 13.55f, 9.5f, 13.36f, 9.5f)
                curveTo(13.17f, 9.5f, 12.98f, 9.43f, 12.83f, 9.28f)
                curveTo(12.54f, 8.99f, 12.54f, 8.51f, 12.83f, 8.22f)
                curveTo(14.12f, 6.93f, 16.23f, 6.93f, 17.53f, 8.22f)
                curveTo(17.82f, 8.52f, 17.82f, 8.99f, 17.53f, 9.28f)
                close()
            }
        }.build()

        return _EmojiSad!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiSad: ImageVector? = null
