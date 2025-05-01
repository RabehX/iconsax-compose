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


val Iconsax.Filled.EmojiNormal: ImageVector
    get() {
        if (_EmojiNormal != null) {
            return _EmojiNormal!!
        }
        _EmojiNormal = ImageVector.Builder(
            name = "Filled.EmojiNormal",
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
                moveTo(6.47f, 7.72f)
                curveTo(6.76f, 7.43f, 7.24f, 7.43f, 7.53f, 7.72f)
                curveTo(8.24f, 8.43f, 9.4f, 8.43f, 10.11f, 7.72f)
                curveTo(10.4f, 7.43f, 10.88f, 7.43f, 11.17f, 7.72f)
                curveTo(11.46f, 8.01f, 11.46f, 8.49f, 11.17f, 8.78f)
                curveTo(10.52f, 9.43f, 9.67f, 9.75f, 8.82f, 9.75f)
                curveTo(7.97f, 9.75f, 7.12f, 9.43f, 6.47f, 8.78f)
                curveTo(6.18f, 8.48f, 6.18f, 8.01f, 6.47f, 7.72f)
                close()
                moveTo(12f, 18.78f)
                curveTo(9.31f, 18.78f, 7.12f, 16.59f, 7.12f, 13.9f)
                curveTo(7.12f, 13.2f, 7.69f, 12.62f, 8.39f, 12.62f)
                horizontalLineTo(15.59f)
                curveTo(16.29f, 12.62f, 16.86f, 13.19f, 16.86f, 13.9f)
                curveTo(16.88f, 16.59f, 14.69f, 18.78f, 12f, 18.78f)
                close()
                moveTo(17.53f, 8.78f)
                curveTo(16.88f, 9.43f, 16.03f, 9.75f, 15.18f, 9.75f)
                curveTo(14.33f, 9.75f, 13.48f, 9.43f, 12.83f, 8.78f)
                curveTo(12.54f, 8.49f, 12.54f, 8.01f, 12.83f, 7.72f)
                curveTo(13.12f, 7.43f, 13.6f, 7.43f, 13.89f, 7.72f)
                curveTo(14.6f, 8.43f, 15.76f, 8.43f, 16.47f, 7.72f)
                curveTo(16.76f, 7.43f, 17.24f, 7.43f, 17.53f, 7.72f)
                curveTo(17.82f, 8.01f, 17.82f, 8.48f, 17.53f, 8.78f)
                close()
            }
        }.build()

        return _EmojiNormal!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiNormal: ImageVector? = null
