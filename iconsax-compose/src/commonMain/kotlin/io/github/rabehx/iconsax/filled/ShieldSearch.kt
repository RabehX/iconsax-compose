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


val Iconsax.Filled.ShieldSearch: ImageVector
    get() {
        if (_ShieldSearch != null) {
            return _ShieldSearch!!
        }
        _ShieldSearch = ImageVector.Builder(
            name = "Filled.ShieldSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.449f, 6.941f)
                verticalLineTo(9.451f)
                curveTo(19.449f, 10.161f, 18.729f, 10.621f, 18.059f, 10.371f)
                curveTo(17.219f, 10.061f, 16.289f, 9.941f, 15.309f, 10.041f)
                curveTo(12.929f, 10.301f, 10.489f, 12.591f, 10.089f, 14.961f)
                curveTo(9.759f, 16.931f, 10.389f, 18.771f, 11.599f, 20.071f)
                curveTo(12.149f, 20.671f, 11.779f, 21.641f, 10.969f, 21.731f)
                curveTo(10.279f, 21.811f, 9.599f, 21.791f, 9.219f, 21.511f)
                lineTo(3.719f, 17.401f)
                curveTo(3.069f, 16.911f, 2.539f, 15.851f, 2.539f, 15.031f)
                verticalLineTo(6.941f)
                curveTo(2.539f, 5.811f, 3.399f, 4.571f, 4.449f, 4.171f)
                lineTo(9.949f, 2.111f)
                curveTo(10.519f, 1.901f, 11.459f, 1.901f, 12.029f, 2.111f)
                lineTo(17.529f, 4.171f)
                curveTo(18.589f, 4.571f, 19.449f, 5.811f, 19.449f, 6.941f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 11.512f)
                curveTo(13.52f, 11.512f, 11.5f, 13.532f, 11.5f, 16.012f)
                curveTo(11.5f, 18.492f, 13.52f, 20.512f, 16f, 20.512f)
                curveTo(18.48f, 20.512f, 20.5f, 18.492f, 20.5f, 16.012f)
                curveTo(20.5f, 13.522f, 18.48f, 11.512f, 16f, 11.512f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 22.001f)
                curveTo(20.73f, 22.001f, 20.48f, 21.891f, 20.29f, 21.711f)
                curveTo(20.25f, 21.661f, 20.2f, 21.611f, 20.17f, 21.551f)
                curveTo(20.13f, 21.501f, 20.1f, 21.441f, 20.08f, 21.381f)
                curveTo(20.05f, 21.321f, 20.03f, 21.261f, 20.02f, 21.201f)
                curveTo(20.01f, 21.131f, 20f, 21.071f, 20f, 21.001f)
                curveTo(20f, 20.871f, 20.03f, 20.741f, 20.08f, 20.621f)
                curveTo(20.13f, 20.491f, 20.2f, 20.391f, 20.29f, 20.291f)
                curveTo(20.52f, 20.061f, 20.87f, 19.951f, 21.19f, 20.021f)
                curveTo(21.26f, 20.031f, 21.32f, 20.051f, 21.38f, 20.081f)
                curveTo(21.44f, 20.101f, 21.5f, 20.131f, 21.55f, 20.171f)
                curveTo(21.61f, 20.201f, 21.66f, 20.251f, 21.71f, 20.291f)
                curveTo(21.8f, 20.391f, 21.87f, 20.491f, 21.92f, 20.621f)
                curveTo(21.97f, 20.741f, 22f, 20.871f, 22f, 21.001f)
                curveTo(22f, 21.261f, 21.89f, 21.521f, 21.71f, 21.711f)
                curveTo(21.66f, 21.751f, 21.61f, 21.791f, 21.55f, 21.831f)
                curveTo(21.5f, 21.871f, 21.44f, 21.901f, 21.38f, 21.921f)
                curveTo(21.32f, 21.951f, 21.26f, 21.971f, 21.19f, 21.981f)
                curveTo(21.13f, 21.991f, 21.06f, 22.001f, 21f, 22.001f)
                close()
            }
        }.build()

        return _ShieldSearch!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSearch: ImageVector? = null
