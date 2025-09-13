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


val Iconsax.Filled.Bucket: ImageVector
    get() {
        if (_Bucket != null) {
            return _Bucket!!
        }
        _Bucket = ImageVector.Builder(
            name = "Filled.Bucket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.041f, 10.641f)
                lineTo(9.691f, 3.291f)
                lineTo(8.821f, 2.421f)
                curveTo(8.531f, 2.131f, 8.051f, 2.131f, 7.761f, 2.421f)
                curveTo(7.471f, 2.711f, 7.471f, 3.191f, 7.761f, 3.481f)
                lineTo(8.631f, 4.351f)
                lineTo(3.001f, 9.981f)
                curveTo(2.361f, 10.621f, 2.021f, 11.271f, 2.001f, 11.921f)
                curveTo(1.981f, 12.611f, 2.321f, 13.301f, 3.001f, 13.991f)
                lineTo(7.011f, 18.001f)
                curveTo(8.351f, 19.331f, 9.691f, 19.331f, 11.021f, 18.001f)
                lineTo(17.041f, 11.981f)
                curveTo(17.241f, 11.781f, 17.331f, 11.511f, 17.311f, 11.251f)
                curveTo(17.301f, 11.031f, 17.201f, 10.801f, 17.041f, 10.641f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 22.75f, 2.25f, 22.41f, 2.25f, 22f)
                curveTo(2.25f, 21.59f, 2.59f, 21.25f, 3f, 21.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 21.25f, 16.75f, 21.59f, 16.75f, 22f)
                curveTo(16.75f, 22.41f, 16.41f, 22.75f, 16f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.35f, 14.78f)
                curveTo(19.09f, 14.5f, 18.61f, 14.5f, 18.35f, 14.78f)
                curveTo(18.04f, 15.12f, 16.5f, 16.85f, 16.5f, 18.17f)
                curveTo(16.5f, 19.47f, 17.55f, 20.52f, 18.85f, 20.52f)
                curveTo(20.15f, 20.52f, 21.2f, 19.47f, 21.2f, 18.17f)
                curveTo(21.2f, 16.86f, 19.66f, 15.12f, 19.35f, 14.78f)
                close()
            }
        }.build()

        return _Bucket!!
    }

@Suppress("ObjectPropertyName")
private var _Bucket: ImageVector? = null
