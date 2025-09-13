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


val Iconsax.Filled.Hierarchy3: ImageVector
    get() {
        if (_Hierarchy3 != null) {
            return _Hierarchy3!!
        }
        _Hierarchy3 = ImageVector.Builder(
            name = "Filled.Hierarchy3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 8f)
                curveTo(6.657f, 8f, 8f, 6.657f, 8f, 5f)
                curveTo(8f, 3.343f, 6.657f, 2f, 5f, 2f)
                curveTo(3.343f, 2f, 2f, 3.343f, 2f, 5f)
                curveTo(2f, 6.657f, 3.343f, 8f, 5f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 15f)
                curveTo(20.657f, 15f, 22f, 13.657f, 22f, 12f)
                curveTo(22f, 10.343f, 20.657f, 9f, 19f, 9f)
                curveTo(17.343f, 9f, 16f, 10.343f, 16f, 12f)
                curveTo(16f, 13.657f, 17.343f, 15f, 19f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 22f)
                curveTo(6.657f, 22f, 8f, 20.657f, 8f, 19f)
                curveTo(8f, 17.343f, 6.657f, 16f, 5f, 16f)
                curveTo(3.343f, 16f, 2f, 17.343f, 2f, 19f)
                curveTo(2f, 20.657f, 3.343f, 22f, 5f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 16.75f)
                curveTo(4.59f, 16.75f, 4.25f, 16.41f, 4.25f, 16f)
                verticalLineTo(8f)
                curveTo(4.25f, 7.59f, 4.59f, 7.25f, 5f, 7.25f)
                curveTo(5.41f, 7.25f, 5.75f, 7.59f, 5.75f, 8f)
                curveTo(5.75f, 10.19f, 6.81f, 11.25f, 9f, 11.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 11.25f, 16.75f, 11.59f, 16.75f, 12f)
                curveTo(16.75f, 12.41f, 16.41f, 12.75f, 16f, 12.75f)
                horizontalLineTo(9f)
                curveTo(7.64f, 12.75f, 6.55f, 12.4f, 5.75f, 11.74f)
                verticalLineTo(16f)
                curveTo(5.75f, 16.41f, 5.41f, 16.75f, 5f, 16.75f)
                close()
            }
        }.build()

        return _Hierarchy3!!
    }

@Suppress("ObjectPropertyName")
private var _Hierarchy3: ImageVector? = null
