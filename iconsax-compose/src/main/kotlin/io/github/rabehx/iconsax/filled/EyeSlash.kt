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


val Iconsax.Filled.EyeSlash: ImageVector
    get() {
        if (_EyeSlash != null) {
            return _EyeSlash!!
        }
        _EyeSlash = ImageVector.Builder(
            name = "Filled.EyeSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.271f, 9.178f)
                curveTo(20.981f, 8.718f, 20.671f, 8.288f, 20.351f, 7.888f)
                curveTo(19.981f, 7.418f, 19.281f, 7.378f, 18.861f, 7.798f)
                lineTo(15.861f, 10.798f)
                curveTo(16.081f, 11.458f, 16.121f, 12.218f, 15.921f, 13.008f)
                curveTo(15.571f, 14.418f, 14.431f, 15.558f, 13.021f, 15.908f)
                curveTo(12.231f, 16.108f, 11.471f, 16.068f, 10.811f, 15.848f)
                curveTo(10.811f, 15.848f, 9.381f, 17.278f, 8.351f, 18.308f)
                curveTo(7.851f, 18.808f, 8.011f, 19.688f, 8.681f, 19.948f)
                curveTo(9.751f, 20.358f, 10.861f, 20.568f, 12.001f, 20.568f)
                curveTo(13.781f, 20.568f, 15.511f, 20.048f, 17.091f, 19.078f)
                curveTo(18.701f, 18.078f, 20.151f, 16.608f, 21.321f, 14.738f)
                curveTo(22.271f, 13.228f, 22.221f, 10.688f, 21.271f, 9.178f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.021f, 9.981f)
                lineTo(9.981f, 14.021f)
                curveTo(9.471f, 13.501f, 9.141f, 12.781f, 9.141f, 12.001f)
                curveTo(9.141f, 10.431f, 10.421f, 9.141f, 12.001f, 9.141f)
                curveTo(12.781f, 9.141f, 13.501f, 9.471f, 14.021f, 9.981f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.25f, 5.75f)
                lineTo(14.86f, 9.14f)
                curveTo(14.13f, 8.4f, 13.12f, 7.96f, 12f, 7.96f)
                curveTo(9.76f, 7.96f, 7.96f, 9.77f, 7.96f, 12f)
                curveTo(7.96f, 13.12f, 8.41f, 14.13f, 9.14f, 14.86f)
                lineTo(5.76f, 18.25f)
                horizontalLineTo(5.75f)
                curveTo(4.64f, 17.35f, 3.62f, 16.2f, 2.75f, 14.84f)
                curveTo(1.75f, 13.27f, 1.75f, 10.72f, 2.75f, 9.15f)
                curveTo(3.91f, 7.33f, 5.33f, 5.9f, 6.91f, 4.92f)
                curveTo(8.49f, 3.96f, 10.22f, 3.43f, 12f, 3.43f)
                curveTo(14.23f, 3.43f, 16.39f, 4.25f, 18.25f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.858f, 11.998f)
                curveTo(14.858f, 13.568f, 13.578f, 14.858f, 11.998f, 14.858f)
                curveTo(11.938f, 14.858f, 11.888f, 14.858f, 11.828f, 14.838f)
                lineTo(14.838f, 11.828f)
                curveTo(14.858f, 11.888f, 14.858f, 11.938f, 14.858f, 11.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.769f, 2.229f)
                curveTo(21.469f, 1.929f, 20.979f, 1.929f, 20.679f, 2.229f)
                lineTo(2.229f, 20.689f)
                curveTo(1.929f, 20.989f, 1.929f, 21.479f, 2.229f, 21.779f)
                curveTo(2.379f, 21.919f, 2.569f, 21.999f, 2.769f, 21.999f)
                curveTo(2.969f, 21.999f, 3.159f, 21.919f, 3.309f, 21.769f)
                lineTo(21.769f, 3.309f)
                curveTo(22.079f, 3.009f, 22.079f, 2.529f, 21.769f, 2.229f)
                close()
            }
        }.build()

        return _EyeSlash!!
    }

@Suppress("ObjectPropertyName")
private var _EyeSlash: ImageVector? = null
