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


val Iconsax.Filled.Colorfilter: ImageVector
    get() {
        if (_Colorfilter != null) {
            return _Colorfilter!!
        }
        _Colorfilter = ImageVector.Builder(
            name = "Filled.Colorfilter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 15.999f)
                curveTo(14f, 17.769f, 13.23f, 19.369f, 12f, 20.459f)
                curveTo(10.94f, 21.419f, 9.54f, 21.999f, 8f, 21.999f)
                curveTo(4.69f, 21.999f, 2f, 19.309f, 2f, 15.999f)
                curveTo(2f, 13.974f, 3.014f, 12.18f, 4.555f, 11.096f)
                curveTo(4.804f, 10.922f, 5.139f, 11.041f, 5.273f, 11.314f)
                curveTo(6.217f, 13.232f, 7.954f, 14.669f, 10.02f, 15.229f)
                curveTo(10.65f, 15.409f, 11.31f, 15.499f, 12f, 15.499f)
                curveTo(12.487f, 15.499f, 12.954f, 15.453f, 13.407f, 15.368f)
                curveTo(13.696f, 15.314f, 13.983f, 15.498f, 13.995f, 15.792f)
                curveTo(13.998f, 15.861f, 14f, 15.931f, 14f, 15.999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 8f)
                curveTo(18f, 8.78f, 17.85f, 9.53f, 17.58f, 10.21f)
                curveTo(16.89f, 11.95f, 15.41f, 13.29f, 13.58f, 13.79f)
                curveTo(13.08f, 13.93f, 12.55f, 14f, 12f, 14f)
                curveTo(11.45f, 14f, 10.92f, 13.93f, 10.42f, 13.79f)
                curveTo(8.59f, 13.29f, 7.11f, 11.95f, 6.42f, 10.21f)
                curveTo(6.15f, 9.53f, 6f, 8.78f, 6f, 8f)
                curveTo(6f, 4.69f, 8.69f, 2f, 12f, 2f)
                curveTo(15.31f, 2f, 18f, 4.69f, 18f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 15.999f)
                curveTo(22f, 19.309f, 19.31f, 21.999f, 16f, 21.999f)
                curveTo(15.255f, 21.999f, 14.539f, 21.863f, 13.881f, 21.613f)
                curveTo(13.562f, 21.492f, 13.503f, 21.084f, 13.725f, 20.825f)
                curveTo(14.867f, 19.493f, 15.5f, 17.785f, 15.5f, 15.999f)
                curveTo(15.5f, 15.659f, 15.47f, 15.319f, 15.42f, 14.999f)
                curveTo(15.39f, 14.815f, 15.484f, 14.633f, 15.648f, 14.543f)
                curveTo(16.972f, 13.81f, 18.053f, 12.687f, 18.727f, 11.314f)
                curveTo(18.861f, 11.042f, 19.197f, 10.922f, 19.445f, 11.097f)
                curveTo(20.986f, 12.181f, 22f, 13.975f, 22f, 15.999f)
                close()
            }
        }.build()

        return _Colorfilter!!
    }

@Suppress("ObjectPropertyName")
private var _Colorfilter: ImageVector? = null
