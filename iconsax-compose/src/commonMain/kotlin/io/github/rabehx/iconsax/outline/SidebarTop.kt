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

val Iconsax.Outline.SidebarTop: ImageVector
    get() {
        if (_SidebarTop != null) {
            return _SidebarTop!!
        }
        _SidebarTop = ImageVector.Builder(
            name = "Outline.SidebarTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.971f, 22.75f)
                horizontalLineTo(8.971f)
                curveTo(3.541f, 22.75f, 1.221f, 20.43f, 1.221f, 15f)
                verticalLineTo(9f)
                curveTo(1.221f, 3.57f, 3.541f, 1.25f, 8.971f, 1.25f)
                horizontalLineTo(14.971f)
                curveTo(20.401f, 1.25f, 22.721f, 3.57f, 22.721f, 9f)
                verticalLineTo(15f)
                curveTo(22.721f, 20.43f, 20.411f, 22.75f, 14.971f, 22.75f)
                close()
                moveTo(8.971f, 2.75f)
                curveTo(4.361f, 2.75f, 2.721f, 4.39f, 2.721f, 9f)
                verticalLineTo(15f)
                curveTo(2.721f, 19.61f, 4.361f, 21.25f, 8.971f, 21.25f)
                horizontalLineTo(14.971f)
                curveTo(19.581f, 21.25f, 21.221f, 19.61f, 21.221f, 15f)
                verticalLineTo(9f)
                curveTo(21.221f, 4.39f, 19.581f, 2.75f, 14.971f, 2.75f)
                horizontalLineTo(8.971f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 9.25f, 1.25f, 8.91f, 1.25f, 8.5f)
                curveTo(1.25f, 8.09f, 1.59f, 7.75f, 2f, 7.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 7.75f, 22.75f, 8.09f, 22.75f, 8.5f)
                curveTo(22.75f, 8.91f, 22.41f, 9.25f, 22f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.561f, 16.25f)
                curveTo(14.371f, 16.25f, 14.181f, 16.18f, 14.031f, 16.03f)
                lineTo(12.001f, 14f)
                lineTo(9.971f, 16.03f)
                curveTo(9.681f, 16.32f, 9.201f, 16.32f, 8.911f, 16.03f)
                curveTo(8.621f, 15.74f, 8.621f, 15.26f, 8.911f, 14.97f)
                lineTo(11.471f, 12.41f)
                curveTo(11.761f, 12.12f, 12.241f, 12.12f, 12.531f, 12.41f)
                lineTo(15.091f, 14.97f)
                curveTo(15.381f, 15.26f, 15.381f, 15.74f, 15.091f, 16.03f)
                curveTo(14.941f, 16.18f, 14.751f, 16.25f, 14.561f, 16.25f)
                close()
            }
        }.build()

        return _SidebarTop!!
    }

@Suppress("ObjectPropertyName")
private var _SidebarTop: ImageVector? = null
