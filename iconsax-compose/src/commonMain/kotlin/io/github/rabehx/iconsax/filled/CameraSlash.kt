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


val Iconsax.Filled.CameraSlash: ImageVector
    get() {
        if (_CameraSlash != null) {
            return _CameraSlash!!
        }
        _CameraSlash = ImageVector.Builder(
            name = "Filled.CameraSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.55f, 5.11f)
                lineTo(15.83f, 3.66f)
                curveTo(15.37f, 2.75f, 14.17f, 2f, 13.15f, 2f)
                horizontalLineTo(10.86f)
                curveTo(9.83f, 2f, 8.63f, 2.75f, 8.17f, 3.66f)
                lineTo(7.45f, 5.11f)
                curveTo(7.17f, 5.65f, 6.61f, 6f, 6f, 6f)
                curveTo(3.83f, 6f, 2.11f, 7.83f, 2.25f, 9.99f)
                lineTo(2.77f, 18.25f)
                curveTo(2.82f, 19.1f, 3.03f, 19.89f, 3.48f, 20.52f)
                lineTo(18f, 6f)
                curveTo(17.39f, 6f, 16.83f, 5.65f, 16.55f, 5.11f)
                close()
                moveTo(9.5f, 10.75f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 10.75f, 5.75f, 10.41f, 5.75f, 10f)
                curveTo(5.75f, 9.59f, 6.09f, 9.25f, 6.5f, 9.25f)
                horizontalLineTo(9.5f)
                curveTo(9.91f, 9.25f, 10.25f, 9.59f, 10.25f, 10f)
                curveTo(10.25f, 10.41f, 9.91f, 10.75f, 9.5f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.75f, 9.988f)
                lineTo(21.23f, 18.248f)
                curveTo(21.1f, 20.308f, 20f, 21.998f, 17.24f, 21.998f)
                horizontalLineTo(7.41f)
                curveTo(6.52f, 21.998f, 6.07f, 20.918f, 6.7f, 20.288f)
                lineTo(9.17f, 17.818f)
                curveTo(9.48f, 17.508f, 9.96f, 17.468f, 10.35f, 17.688f)
                curveTo(11.04f, 18.078f, 11.87f, 18.228f, 12.75f, 18.038f)
                curveTo(14.02f, 17.768f, 15.05f, 16.728f, 15.3f, 15.448f)
                curveTo(15.47f, 14.588f, 15.32f, 13.778f, 14.94f, 13.108f)
                curveTo(14.72f, 12.718f, 14.75f, 12.228f, 15.07f, 11.918f)
                lineTo(19.57f, 7.418f)
                curveTo(19.98f, 7.008f, 20.67f, 7.058f, 21.02f, 7.528f)
                curveTo(21.54f, 8.208f, 21.81f, 9.068f, 21.75f, 9.988f)
                close()
            }
        }.build()

        return _CameraSlash!!
    }

@Suppress("ObjectPropertyName")
private var _CameraSlash: ImageVector? = null
