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


val Iconsax.Filled.PrinterSlash: ImageVector
    get() {
        if (_PrinterSlash != null) {
            return _PrinterSlash!!
        }
        _PrinterSlash = ImageVector.Builder(
            name = "Filled.PrinterSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 7f)
                curveTo(4f, 7f, 3f, 8f, 3f, 10f)
                verticalLineTo(15f)
                curveTo(3f, 17f, 4f, 18f, 6f, 18f)
                lineTo(8f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                lineTo(17f, 7f)
                horizontalLineTo(6f)
                close()
                moveTo(7f, 11.75f)
                curveTo(6.59f, 11.75f, 6.25f, 11.41f, 6.25f, 11f)
                curveTo(6.25f, 10.59f, 6.59f, 10.25f, 7f, 10.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 10.25f, 9.75f, 10.59f, 9.75f, 11f)
                curveTo(9.75f, 11.41f, 9.41f, 11.75f, 9f, 11.75f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 15f)
                lineTo(8f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                curveTo(7f, 3.34f, 8.34f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(15.66f, 2f, 17f, 3.34f, 17f, 5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.529f, 1.471f)
                curveTo(22.24f, 1.181f, 21.76f, 1.181f, 21.469f, 1.471f)
                lineTo(1.469f, 21.471f)
                curveTo(1.179f, 21.761f, 1.179f, 22.241f, 1.469f, 22.531f)
                curveTo(1.619f, 22.681f, 1.809f, 22.751f, 1.999f, 22.751f)
                curveTo(2.189f, 22.751f, 2.379f, 22.681f, 2.529f, 22.531f)
                lineTo(22.529f, 2.531f)
                curveTo(22.819f, 2.241f, 22.819f, 1.761f, 22.529f, 1.471f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 14.25f)
                horizontalLineTo(12.957f)
                curveTo(12.825f, 14.25f, 12.697f, 14.303f, 12.604f, 14.396f)
                lineTo(12f, 15f)
                lineTo(11.25f, 15.75f)
                lineTo(8.8f, 18.2f)
                curveTo(8.16f, 18.84f, 8.03f, 20f, 8.55f, 20.74f)
                curveTo(9.09f, 21.5f, 9.99f, 22f, 11f, 22f)
                horizontalLineTo(13f)
                curveTo(14.66f, 22f, 16f, 20.66f, 16f, 19f)
                verticalLineTo(15.75f)
                horizontalLineTo(17f)
                curveTo(17.41f, 15.75f, 17.75f, 15.41f, 17.75f, 15f)
                curveTo(17.75f, 14.59f, 17.41f, 14.25f, 17f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.02f, 7.979f)
                lineTo(15.46f, 11.539f)
                curveTo(14.83f, 12.169f, 15.28f, 13.249f, 16.17f, 13.249f)
                horizontalLineTo(16.91f)
                curveTo(17.78f, 13.249f, 18.59f, 13.839f, 18.73f, 14.699f)
                curveTo(18.881f, 15.615f, 18.313f, 16.438f, 17.493f, 16.679f)
                curveTo(17.228f, 16.756f, 17f, 16.973f, 17f, 17.249f)
                verticalLineTo(17.499f)
                curveTo(17f, 17.775f, 17.224f, 17.999f, 17.5f, 17.999f)
                horizontalLineTo(18f)
                curveTo(19.66f, 17.999f, 21f, 16.659f, 21f, 14.999f)
                verticalLineTo(9.999f)
                curveTo(21f, 9.209f, 20.84f, 8.569f, 20.53f, 8.089f)
                curveTo(20.19f, 7.579f, 19.45f, 7.549f, 19.02f, 7.979f)
                close()
            }
        }.build()

        return _PrinterSlash!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterSlash: ImageVector? = null
