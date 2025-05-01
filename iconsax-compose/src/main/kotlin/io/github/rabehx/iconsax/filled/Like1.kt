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


val Iconsax.Filled.Like1: ImageVector
    get() {
        if (_Like1 != null) {
            return _Like1!!
        }
        _Like1 = ImageVector.Builder(
            name = "Filled.Like1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.391f, 18.491f)
                verticalLineTo(8.331f)
                curveTo(8.391f, 7.931f, 8.511f, 7.541f, 8.731f, 7.211f)
                lineTo(11.461f, 3.151f)
                curveTo(11.891f, 2.501f, 12.961f, 2.041f, 13.871f, 2.381f)
                curveTo(14.851f, 2.711f, 15.501f, 3.811f, 15.291f, 4.791f)
                lineTo(14.771f, 8.061f)
                curveTo(14.731f, 8.361f, 14.811f, 8.631f, 14.981f, 8.841f)
                curveTo(15.151f, 9.031f, 15.401f, 9.151f, 15.671f, 9.151f)
                horizontalLineTo(19.781f)
                curveTo(20.571f, 9.151f, 21.251f, 9.471f, 21.651f, 10.031f)
                curveTo(22.031f, 10.571f, 22.101f, 11.271f, 21.851f, 11.981f)
                lineTo(19.391f, 19.471f)
                curveTo(19.081f, 20.711f, 17.731f, 21.721f, 16.391f, 21.721f)
                horizontalLineTo(12.491f)
                curveTo(11.821f, 21.721f, 10.881f, 21.491f, 10.451f, 21.061f)
                lineTo(9.171f, 20.071f)
                curveTo(8.681f, 19.701f, 8.391f, 19.111f, 8.391f, 18.491f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.21f, 6.379f)
                horizontalLineTo(4.18f)
                curveTo(2.63f, 6.379f, 2f, 6.979f, 2f, 8.459f)
                verticalLineTo(18.519f)
                curveTo(2f, 19.999f, 2.63f, 20.599f, 4.18f, 20.599f)
                horizontalLineTo(5.21f)
                curveTo(6.76f, 20.599f, 7.39f, 19.999f, 7.39f, 18.519f)
                verticalLineTo(8.459f)
                curveTo(7.39f, 6.979f, 6.76f, 6.379f, 5.21f, 6.379f)
                close()
            }
        }.build()

        return _Like1!!
    }

@Suppress("ObjectPropertyName")
private var _Like1: ImageVector? = null
