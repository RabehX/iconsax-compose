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

val Iconsax.Filled.Arrow: ImageVector
    get() {
        if (_Arrow != null) {
            return _Arrow!!
        }
        _Arrow = ImageVector.Builder(
            name = "Filled.Arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(20f)
                curveTo(11.25f, 19.59f, 11.59f, 19.25f, 12f, 19.25f)
                curveTo(12.41f, 19.25f, 12.75f, 19.59f, 12.75f, 20f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18f)
                verticalLineTo(16f)
                curveTo(11.25f, 15.59f, 11.59f, 15.25f, 12f, 15.25f)
                curveTo(12.41f, 15.25f, 12.75f, 15.59f, 12.75f, 16f)
                verticalLineTo(18f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.75f)
                curveTo(11.59f, 14.75f, 11.25f, 14.41f, 11.25f, 14f)
                verticalLineTo(11f)
                curveTo(11.25f, 6.73f, 14.73f, 3.25f, 19f, 3.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 3.25f, 22.75f, 3.59f, 22.75f, 4f)
                curveTo(22.75f, 4.41f, 22.41f, 4.75f, 22f, 4.75f)
                horizontalLineTo(19f)
                curveTo(15.55f, 4.75f, 12.75f, 7.55f, 12.75f, 11f)
                verticalLineTo(14f)
                curveTo(12.75f, 14.41f, 12.41f, 14.75f, 12f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.75f)
                curveTo(11.59f, 14.75f, 11.25f, 14.41f, 11.25f, 14f)
                verticalLineTo(11f)
                curveTo(11.25f, 7.55f, 8.45f, 4.75f, 5f, 4.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 4.75f, 1.25f, 4.41f, 1.25f, 4f)
                curveTo(1.25f, 3.59f, 1.59f, 3.25f, 2f, 3.25f)
                horizontalLineTo(5f)
                curveTo(9.27f, 3.25f, 12.75f, 6.73f, 12.75f, 11f)
                verticalLineTo(14f)
                curveTo(12.75f, 14.41f, 12.41f, 14.75f, 12f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.001f, 6.751f)
                curveTo(3.811f, 6.751f, 3.621f, 6.681f, 3.471f, 6.531f)
                lineTo(1.471f, 4.531f)
                curveTo(1.181f, 4.241f, 1.181f, 3.761f, 1.471f, 3.471f)
                lineTo(3.471f, 1.471f)
                curveTo(3.761f, 1.181f, 4.241f, 1.181f, 4.531f, 1.471f)
                curveTo(4.821f, 1.761f, 4.821f, 2.241f, 4.531f, 2.531f)
                lineTo(3.061f, 4.001f)
                lineTo(4.531f, 5.471f)
                curveTo(4.821f, 5.761f, 4.821f, 6.241f, 4.531f, 6.531f)
                curveTo(4.381f, 6.681f, 4.191f, 6.751f, 4.001f, 6.751f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.001f, 6.751f)
                curveTo(19.811f, 6.751f, 19.621f, 6.681f, 19.471f, 6.531f)
                curveTo(19.181f, 6.241f, 19.181f, 5.761f, 19.471f, 5.471f)
                lineTo(20.941f, 4.001f)
                lineTo(19.471f, 2.531f)
                curveTo(19.181f, 2.241f, 19.181f, 1.761f, 19.471f, 1.471f)
                curveTo(19.761f, 1.181f, 20.241f, 1.181f, 20.531f, 1.471f)
                lineTo(22.531f, 3.471f)
                curveTo(22.821f, 3.761f, 22.821f, 4.241f, 22.531f, 4.531f)
                lineTo(20.531f, 6.531f)
                curveTo(20.381f, 6.681f, 20.191f, 6.751f, 20.001f, 6.751f)
                close()
            }
        }.build()

        return _Arrow!!
    }

@Suppress("ObjectPropertyName")
private var _Arrow: ImageVector? = null
