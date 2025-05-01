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


val Iconsax.Filled.Crown: ImageVector
    get() {
        if (_Crown != null) {
            return _Crown!!
        }
        _Crown = ImageVector.Builder(
            name = "Filled.Crown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22f)
                horizontalLineTo(7f)
                curveTo(6.59f, 22f, 6.25f, 21.66f, 6.25f, 21.25f)
                curveTo(6.25f, 20.84f, 6.59f, 20.5f, 7f, 20.5f)
                horizontalLineTo(17f)
                curveTo(17.41f, 20.5f, 17.75f, 20.84f, 17.75f, 21.25f)
                curveTo(17.75f, 21.66f, 17.41f, 22f, 17f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.35f, 5.519f)
                lineTo(16.35f, 8.379f)
                curveTo(15.82f, 8.759f, 15.06f, 8.529f, 14.83f, 7.919f)
                lineTo(12.94f, 2.879f)
                curveTo(12.62f, 2.009f, 11.39f, 2.009f, 11.07f, 2.879f)
                lineTo(9.17f, 7.909f)
                curveTo(8.94f, 8.529f, 8.19f, 8.759f, 7.66f, 8.369f)
                lineTo(3.66f, 5.509f)
                curveTo(2.86f, 4.949f, 1.8f, 5.739f, 2.13f, 6.669f)
                lineTo(6.29f, 18.319f)
                curveTo(6.43f, 18.719f, 6.81f, 18.979f, 7.23f, 18.979f)
                horizontalLineTo(16.76f)
                curveTo(17.18f, 18.979f, 17.56f, 18.709f, 17.7f, 18.319f)
                lineTo(21.86f, 6.669f)
                curveTo(22.2f, 5.739f, 21.14f, 4.949f, 20.35f, 5.519f)
                close()
                moveTo(14.5f, 14.749f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 14.749f, 8.75f, 14.409f, 8.75f, 13.999f)
                curveTo(8.75f, 13.589f, 9.09f, 13.249f, 9.5f, 13.249f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 13.249f, 15.25f, 13.589f, 15.25f, 13.999f)
                curveTo(15.25f, 14.409f, 14.91f, 14.749f, 14.5f, 14.749f)
                close()
            }
        }.build()

        return _Crown!!
    }

@Suppress("ObjectPropertyName")
private var _Crown: ImageVector? = null
