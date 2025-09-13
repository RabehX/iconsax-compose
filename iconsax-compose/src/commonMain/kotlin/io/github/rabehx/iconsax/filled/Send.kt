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


val Iconsax.Filled.Send: ImageVector
    get() {
        if (_Send != null) {
            return _Send!!
        }
        _Send = ImageVector.Builder(
            name = "Filled.Send",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 21.25f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 21.25f, 2.75f, 21.59f, 2.75f, 22f)
                curveTo(2.75f, 22.41f, 3.09f, 22.75f, 3.5f, 22.75f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 22.75f, 21.25f, 22.41f, 21.25f, 22f)
                curveTo(21.25f, 21.59f, 20.91f, 21.25f, 20.5f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 14.52f)
                curveTo(5.41f, 14.52f, 5.75f, 14.18f, 5.75f, 13.77f)
                verticalLineTo(5.31f)
                lineTo(18.47f, 18.03f)
                curveTo(18.62f, 18.18f, 18.81f, 18.25f, 19f, 18.25f)
                curveTo(19.19f, 18.25f, 19.38f, 18.18f, 19.53f, 18.03f)
                curveTo(19.82f, 17.74f, 19.82f, 17.26f, 19.53f, 16.97f)
                lineTo(6.81f, 4.25f)
                horizontalLineTo(15.27f)
                curveTo(15.68f, 4.25f, 16.02f, 3.91f, 16.02f, 3.5f)
                curveTo(16.02f, 3.09f, 15.68f, 2.75f, 15.27f, 2.75f)
                horizontalLineTo(5f)
                curveTo(4.9f, 2.75f, 4.81f, 2.77f, 4.71f, 2.81f)
                curveTo(4.53f, 2.88f, 4.38f, 3.03f, 4.31f, 3.21f)
                curveTo(4.27f, 3.31f, 4.25f, 3.4f, 4.25f, 3.5f)
                verticalLineTo(13.77f)
                curveTo(4.25f, 14.18f, 4.59f, 14.52f, 5f, 14.52f)
                close()
            }
        }.build()

        return _Send!!
    }

@Suppress("ObjectPropertyName")
private var _Send: ImageVector? = null
