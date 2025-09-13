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


val Iconsax.Filled.CardPos: ImageVector
    get() {
        if (_CardPos != null) {
            return _CardPos!!
        }
        _CardPos = ImageVector.Builder(
            name = "Filled.CardPos",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 21.25f)
                curveTo(22f, 21.66f, 21.66f, 22f, 21.25f, 22f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 22f, 2f, 21.66f, 2f, 21.25f)
                curveTo(2f, 20.84f, 2.34f, 20.5f, 2.75f, 20.5f)
                horizontalLineTo(21.25f)
                curveTo(21.66f, 20.5f, 22f, 20.84f, 22f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.391f, 4.522f)
                lineTo(4.651f, 15.262f)
                curveTo(4.241f, 15.672f, 3.581f, 15.672f, 3.181f, 15.262f)
                horizontalLineTo(3.171f)
                curveTo(1.781f, 13.862f, 1.781f, 11.602f, 3.171f, 10.212f)
                lineTo(10.321f, 3.062f)
                curveTo(11.721f, 1.662f, 13.981f, 1.662f, 15.381f, 3.062f)
                curveTo(15.791f, 3.452f, 15.791f, 4.122f, 15.391f, 4.522f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.821f, 8.49f)
                lineTo(17.771f, 5.44f)
                curveTo(17.361f, 5.03f, 16.701f, 5.03f, 16.301f, 5.44f)
                lineTo(5.561f, 16.18f)
                curveTo(5.151f, 16.58f, 5.151f, 17.24f, 5.561f, 17.65f)
                lineTo(8.611f, 20.71f)
                curveTo(10.011f, 22.1f, 12.271f, 22.1f, 13.671f, 20.71f)
                lineTo(20.811f, 13.56f)
                curveTo(22.231f, 12.16f, 22.231f, 9.89f, 20.821f, 8.49f)
                close()
                moveTo(12.761f, 17.52f)
                lineTo(11.551f, 18.74f)
                curveTo(11.301f, 18.99f, 10.891f, 18.99f, 10.631f, 18.74f)
                curveTo(10.381f, 18.49f, 10.381f, 18.08f, 10.631f, 17.82f)
                lineTo(11.851f, 16.6f)
                curveTo(12.091f, 16.36f, 12.511f, 16.36f, 12.761f, 16.6f)
                curveTo(13.011f, 16.85f, 13.011f, 17.28f, 12.761f, 17.52f)
                close()
                moveTo(16.731f, 13.55f)
                lineTo(14.291f, 16f)
                curveTo(14.041f, 16.24f, 13.631f, 16.24f, 13.371f, 16f)
                curveTo(13.121f, 15.75f, 13.121f, 15.34f, 13.371f, 15.08f)
                lineTo(15.821f, 12.63f)
                curveTo(16.061f, 12.39f, 16.481f, 12.39f, 16.731f, 12.63f)
                curveTo(16.981f, 12.89f, 16.981f, 13.3f, 16.731f, 13.55f)
                close()
            }
        }.build()

        return _CardPos!!
    }

@Suppress("ObjectPropertyName")
private var _CardPos: ImageVector? = null
