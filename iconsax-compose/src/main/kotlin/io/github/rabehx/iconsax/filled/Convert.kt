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


val Iconsax.Filled.Convert: ImageVector
    get() {
        if (_Convert != null) {
            return _Convert!!
        }
        _Convert = ImageVector.Builder(
            name = "Filled.Convert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.031f, 2.031f)
                curveTo(10.081f, 2.031f, 8.261f, 2.591f, 6.731f, 3.551f)
                lineTo(13.591f, 10.421f)
                lineTo(13.601f, 7.681f)
                curveTo(13.601f, 7.271f, 13.941f, 6.931f, 14.351f, 6.931f)
                curveTo(14.771f, 6.931f, 15.101f, 7.271f, 15.101f, 7.681f)
                lineTo(15.091f, 12.231f)
                curveTo(15.091f, 12.541f, 14.901f, 12.811f, 14.621f, 12.921f)
                curveTo(14.531f, 12.961f, 14.431f, 12.981f, 14.341f, 12.981f)
                curveTo(14.141f, 12.981f, 13.951f, 12.901f, 13.811f, 12.761f)
                lineTo(5.621f, 4.561f)
                curveTo(5.581f, 4.521f, 5.551f, 4.481f, 5.521f, 4.441f)
                curveTo(3.381f, 6.281f, 2.031f, 9.001f, 2.031f, 12.031f)
                curveTo(2.031f, 17.551f, 6.511f, 22.031f, 12.031f, 22.031f)
                curveTo(13.981f, 22.031f, 15.801f, 21.471f, 17.331f, 20.511f)
                lineTo(10.471f, 13.641f)
                lineTo(10.461f, 16.381f)
                curveTo(10.461f, 16.791f, 10.121f, 17.131f, 9.711f, 17.131f)
                curveTo(9.291f, 17.131f, 8.961f, 16.791f, 8.961f, 16.381f)
                lineTo(8.971f, 11.831f)
                curveTo(8.971f, 11.521f, 9.161f, 11.251f, 9.441f, 11.141f)
                curveTo(9.711f, 11.021f, 10.041f, 11.081f, 10.251f, 11.301f)
                lineTo(18.441f, 19.501f)
                curveTo(18.481f, 19.541f, 18.511f, 19.581f, 18.541f, 19.621f)
                curveTo(20.681f, 17.781f, 22.031f, 15.061f, 22.031f, 12.031f)
                curveTo(22.031f, 6.511f, 17.551f, 2.031f, 12.031f, 2.031f)
                close()
            }
        }.build()

        return _Convert!!
    }

@Suppress("ObjectPropertyName")
private var _Convert: ImageVector? = null
