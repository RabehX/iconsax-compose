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


val Iconsax.Filled.SidebarLeft: ImageVector
    get() {
        if (_SidebarLeft != null) {
            return _SidebarLeft!!
        }
        _SidebarLeft = ImageVector.Builder(
            name = "Filled.SidebarLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 7.811f)
                verticalLineTo(16.191f)
                curveTo(2f, 17.681f, 2.36f, 18.921f, 3.05f, 19.871f)
                curveTo(3.34f, 20.291f, 3.71f, 20.661f, 4.13f, 20.951f)
                curveTo(4.95f, 21.551f, 5.99f, 21.901f, 7.22f, 21.981f)
                verticalLineTo(2.031f)
                curveTo(3.94f, 2.241f, 2f, 4.371f, 2f, 7.811f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.951f, 4.13f)
                curveTo(20.661f, 3.71f, 20.291f, 3.34f, 19.871f, 3.05f)
                curveTo(18.921f, 2.36f, 17.681f, 2f, 16.191f, 2f)
                horizontalLineTo(8.721f)
                verticalLineTo(22f)
                horizontalLineTo(16.191f)
                curveTo(19.831f, 22f, 22.001f, 19.83f, 22.001f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.001f, 6.32f, 21.641f, 5.08f, 20.951f, 4.13f)
                close()
                moveTo(15.501f, 14.03f)
                curveTo(15.791f, 14.32f, 15.791f, 14.8f, 15.501f, 15.09f)
                curveTo(15.351f, 15.24f, 15.161f, 15.31f, 14.971f, 15.31f)
                curveTo(14.781f, 15.31f, 14.591f, 15.24f, 14.441f, 15.09f)
                lineTo(11.881f, 12.53f)
                curveTo(11.591f, 12.24f, 11.591f, 11.76f, 11.881f, 11.47f)
                lineTo(14.441f, 8.91f)
                curveTo(14.731f, 8.62f, 15.211f, 8.62f, 15.501f, 8.91f)
                curveTo(15.791f, 9.2f, 15.791f, 9.68f, 15.501f, 9.97f)
                lineTo(13.481f, 12f)
                lineTo(15.501f, 14.03f)
                close()
            }
        }.build()

        return _SidebarLeft!!
    }

@Suppress("ObjectPropertyName")
private var _SidebarLeft: ImageVector? = null
