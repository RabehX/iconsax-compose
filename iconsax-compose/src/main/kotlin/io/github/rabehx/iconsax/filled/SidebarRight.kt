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


val Iconsax.Filled.SidebarRight: ImageVector
    get() {
        if (_SidebarRight != null) {
            return _SidebarRight!!
        }
        _SidebarRight = ImageVector.Builder(
            name = "Filled.SidebarRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.81f, 2f)
                curveTo(6.32f, 2f, 5.08f, 2.36f, 4.13f, 3.05f)
                curveTo(3.71f, 3.34f, 3.34f, 3.71f, 3.05f, 4.13f)
                curveTo(2.36f, 5.08f, 2f, 6.32f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(15.28f)
                verticalLineTo(2f)
                horizontalLineTo(7.81f)
                close()
                moveTo(12.12f, 12.53f)
                lineTo(9.56f, 15.09f)
                curveTo(9.41f, 15.24f, 9.22f, 15.31f, 9.03f, 15.31f)
                curveTo(8.84f, 15.31f, 8.65f, 15.24f, 8.5f, 15.09f)
                curveTo(8.21f, 14.8f, 8.21f, 14.32f, 8.5f, 14.03f)
                lineTo(10.52f, 12f)
                lineTo(8.5f, 9.97f)
                curveTo(8.2f, 9.68f, 8.2f, 9.2f, 8.5f, 8.91f)
                curveTo(8.8f, 8.62f, 9.27f, 8.62f, 9.56f, 8.91f)
                lineTo(12.12f, 11.47f)
                curveTo(12.41f, 11.76f, 12.41f, 12.24f, 12.12f, 12.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.779f, 2.031f)
                verticalLineTo(21.981f)
                curveTo(18.009f, 21.901f, 19.049f, 21.551f, 19.869f, 20.951f)
                curveTo(20.289f, 20.661f, 20.659f, 20.291f, 20.949f, 19.871f)
                curveTo(21.639f, 18.921f, 21.999f, 17.681f, 21.999f, 16.191f)
                verticalLineTo(7.811f)
                curveTo(21.999f, 4.371f, 20.059f, 2.241f, 16.779f, 2.031f)
                close()
            }
        }.build()

        return _SidebarRight!!
    }

@Suppress("ObjectPropertyName")
private var _SidebarRight: ImageVector? = null
