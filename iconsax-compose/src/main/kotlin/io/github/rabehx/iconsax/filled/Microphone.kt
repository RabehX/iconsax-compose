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


val Iconsax.Filled.Microphone: ImageVector
    get() {
        if (_Microphone != null) {
            return _Microphone!!
        }
        _Microphone = ImageVector.Builder(
            name = "Filled.Microphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.002f, 21.929f)
                curveTo(6.962f, 21.929f, 2.852f, 17.829f, 2.852f, 12.779f)
                verticalLineTo(10.899f)
                curveTo(2.852f, 10.509f, 3.172f, 10.199f, 3.552f, 10.199f)
                curveTo(3.932f, 10.199f, 4.252f, 10.519f, 4.252f, 10.899f)
                verticalLineTo(12.779f)
                curveTo(4.252f, 17.049f, 7.722f, 20.519f, 11.992f, 20.519f)
                curveTo(16.262f, 20.519f, 19.732f, 17.049f, 19.732f, 12.779f)
                verticalLineTo(10.899f)
                curveTo(19.732f, 10.509f, 20.052f, 10.199f, 20.432f, 10.199f)
                curveTo(20.812f, 10.199f, 21.132f, 10.519f, 21.132f, 10.899f)
                verticalLineTo(12.779f)
                curveTo(21.152f, 17.829f, 17.042f, 21.929f, 12.002f, 21.929f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.998f, 2f)
                curveTo(8.638f, 2f, 5.898f, 4.74f, 5.898f, 8.1f)
                verticalLineTo(12.79f)
                curveTo(5.898f, 16.15f, 8.638f, 18.89f, 11.998f, 18.89f)
                curveTo(15.358f, 18.89f, 18.098f, 16.15f, 18.098f, 12.79f)
                verticalLineTo(8.1f)
                curveTo(18.098f, 4.74f, 15.358f, 2f, 11.998f, 2f)
                close()
                moveTo(14.178f, 10.59f)
                curveTo(14.108f, 10.86f, 13.858f, 11.04f, 13.588f, 11.04f)
                curveTo(13.538f, 11.04f, 13.478f, 11.03f, 13.428f, 11.02f)
                curveTo(12.408f, 10.74f, 11.328f, 10.74f, 10.308f, 11.02f)
                curveTo(9.978f, 11.11f, 9.648f, 10.92f, 9.558f, 10.59f)
                curveTo(9.468f, 10.27f, 9.658f, 9.93f, 9.988f, 9.84f)
                curveTo(11.218f, 9.5f, 12.518f, 9.5f, 13.748f, 9.84f)
                curveTo(14.078f, 9.93f, 14.268f, 10.26f, 14.178f, 10.59f)
                close()
                moveTo(15.028f, 7.82f)
                curveTo(14.938f, 8.07f, 14.708f, 8.22f, 14.458f, 8.22f)
                curveTo(14.388f, 8.22f, 14.318f, 8.21f, 14.248f, 8.18f)
                curveTo(12.718f, 7.62f, 11.038f, 7.62f, 9.508f, 8.18f)
                curveTo(9.188f, 8.3f, 8.838f, 8.14f, 8.718f, 7.82f)
                curveTo(8.608f, 7.51f, 8.768f, 7.16f, 9.088f, 7.04f)
                curveTo(10.888f, 6.39f, 12.868f, 6.39f, 14.658f, 7.04f)
                curveTo(14.978f, 7.16f, 15.138f, 7.51f, 15.028f, 7.82f)
                close()
            }
        }.build()

        return _Microphone!!
    }

@Suppress("ObjectPropertyName")
private var _Microphone: ImageVector? = null
