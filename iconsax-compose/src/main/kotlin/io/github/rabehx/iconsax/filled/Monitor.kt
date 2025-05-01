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


val Iconsax.Filled.Monitor: ImageVector
    get() {
        if (_Monitor != null) {
            return _Monitor!!
        }
        _Monitor = ImageVector.Builder(
            name = "Filled.Monitor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.56f, 2f)
                horizontalLineTo(6.41f)
                curveTo(3.98f, 2f, 2f, 3.98f, 2f, 6.41f)
                verticalLineTo(12.91f)
                verticalLineTo(13.11f)
                curveTo(2f, 15.55f, 3.98f, 17.52f, 6.41f, 17.52f)
                horizontalLineTo(10.25f)
                curveTo(10.8f, 17.52f, 11.25f, 17.97f, 11.25f, 18.52f)
                verticalLineTo(19.49f)
                curveTo(11.25f, 20.04f, 10.8f, 20.49f, 10.25f, 20.49f)
                horizontalLineTo(7.83f)
                curveTo(7.42f, 20.49f, 7.08f, 20.83f, 7.08f, 21.24f)
                curveTo(7.08f, 21.65f, 7.41f, 22f, 7.83f, 22f)
                horizontalLineTo(16.18f)
                curveTo(16.59f, 22f, 16.93f, 21.66f, 16.93f, 21.25f)
                curveTo(16.93f, 20.84f, 16.59f, 20.5f, 16.18f, 20.5f)
                horizontalLineTo(13.76f)
                curveTo(13.21f, 20.5f, 12.76f, 20.05f, 12.76f, 19.5f)
                verticalLineTo(18.53f)
                curveTo(12.76f, 17.98f, 13.21f, 17.53f, 13.76f, 17.53f)
                horizontalLineTo(17.57f)
                curveTo(20.01f, 17.53f, 21.98f, 15.55f, 21.98f, 13.12f)
                verticalLineTo(12.92f)
                verticalLineTo(6.42f)
                curveTo(21.97f, 3.98f, 19.99f, 2f, 17.56f, 2f)
                close()
            }
        }.build()

        return _Monitor!!
    }

@Suppress("ObjectPropertyName")
private var _Monitor: ImageVector? = null
