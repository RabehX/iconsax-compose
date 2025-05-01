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


val Iconsax.Filled.Forbidden: ImageVector
    get() {
        if (_Forbidden != null) {
            return _Forbidden!!
        }
        _Forbidden = ImageVector.Builder(
            name = "Filled.Forbidden",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.02f, 2.88f)
                curveTo(16.54f, 2.4f, 15.58f, 2f, 14.9f, 2f)
                horizontalLineTo(9.1f)
                curveTo(8.42f, 2f, 7.46f, 2.4f, 6.98f, 2.88f)
                lineTo(2.88f, 6.98f)
                curveTo(2.4f, 7.46f, 2f, 8.42f, 2f, 9.1f)
                verticalLineTo(14.9f)
                curveTo(2f, 15.58f, 2.4f, 16.54f, 2.88f, 17.02f)
                lineTo(4.41f, 18.55f)
                lineTo(18.55f, 4.41f)
                lineTo(17.02f, 2.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.121f, 6.979f)
                lineTo(19.611f, 5.469f)
                lineTo(5.471f, 19.609f)
                lineTo(6.981f, 21.119f)
                curveTo(7.461f, 21.599f, 8.421f, 21.999f, 9.101f, 21.999f)
                horizontalLineTo(14.901f)
                curveTo(15.581f, 21.999f, 16.541f, 21.599f, 17.021f, 21.119f)
                lineTo(21.121f, 17.019f)
                curveTo(21.601f, 16.539f, 22.001f, 15.579f, 22.001f, 14.899f)
                verticalLineTo(9.099f)
                curveTo(22.001f, 8.419f, 21.601f, 7.459f, 21.121f, 6.979f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.491f, 20.471f)
                curveTo(2.201f, 20.761f, 2.201f, 21.241f, 2.491f, 21.531f)
                curveTo(2.641f, 21.681f, 2.831f, 21.751f, 3.021f, 21.751f)
                curveTo(3.211f, 21.751f, 3.401f, 21.681f, 3.551f, 21.531f)
                lineTo(5.471f, 19.611f)
                lineTo(4.411f, 18.551f)
                lineTo(2.491f, 20.471f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.531f, 3.551f)
                curveTo(21.821f, 3.261f, 21.821f, 2.781f, 21.531f, 2.491f)
                curveTo(21.241f, 2.201f, 20.761f, 2.201f, 20.471f, 2.491f)
                lineTo(18.551f, 4.411f)
                lineTo(19.611f, 5.471f)
                lineTo(21.531f, 3.551f)
                close()
            }
        }.build()

        return _Forbidden!!
    }

@Suppress("ObjectPropertyName")
private var _Forbidden: ImageVector? = null
