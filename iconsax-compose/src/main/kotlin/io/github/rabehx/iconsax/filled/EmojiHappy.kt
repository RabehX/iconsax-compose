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


val Iconsax.Filled.EmojiHappy: ImageVector
    get() {
        if (_EmojiHappy != null) {
            return _EmojiHappy!!
        }
        _EmojiHappy = ImageVector.Builder(
            name = "Filled.EmojiHappy",
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
                moveTo(8.5f, 6.38f)
                curveTo(9.53f, 6.38f, 10.38f, 7.22f, 10.38f, 8.26f)
                curveTo(10.38f, 9.3f, 9.54f, 10.14f, 8.5f, 10.14f)
                curveTo(7.46f, 10.14f, 6.62f, 9.28f, 6.62f, 8.25f)
                curveTo(6.62f, 7.22f, 7.47f, 6.38f, 8.5f, 6.38f)
                close()
                moveTo(12f, 19.08f)
                curveTo(9.31f, 19.08f, 7.12f, 16.89f, 7.12f, 14.2f)
                curveTo(7.12f, 13.5f, 7.69f, 12.92f, 8.39f, 12.92f)
                horizontalLineTo(15.59f)
                curveTo(16.29f, 12.92f, 16.86f, 13.49f, 16.86f, 14.2f)
                curveTo(16.88f, 16.89f, 14.69f, 19.08f, 12f, 19.08f)
                close()
                moveTo(15.5f, 10.12f)
                curveTo(14.47f, 10.12f, 13.62f, 9.28f, 13.62f, 8.24f)
                curveTo(13.62f, 7.2f, 14.46f, 6.36f, 15.5f, 6.36f)
                curveTo(16.54f, 6.36f, 17.38f, 7.2f, 17.38f, 8.24f)
                curveTo(17.38f, 9.28f, 16.53f, 10.12f, 15.5f, 10.12f)
                close()
            }
        }.build()

        return _EmojiHappy!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiHappy: ImageVector? = null
