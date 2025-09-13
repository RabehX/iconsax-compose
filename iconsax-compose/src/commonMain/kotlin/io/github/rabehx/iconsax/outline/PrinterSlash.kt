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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.PrinterSlash: ImageVector
    get() {
        if (_PrinterSlash != null) {
            return _PrinterSlash!!
        }
        _PrinterSlash = ImageVector.Builder(
            name = "Outline.PrinterSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.75f, 7.75f)
                horizontalLineTo(7.25f)
                curveTo(6.84f, 7.75f, 6.5f, 7.41f, 6.5f, 7f)
                verticalLineTo(5f)
                curveTo(6.5f, 2.44f, 7.69f, 1.25f, 10.25f, 1.25f)
                horizontalLineTo(13.75f)
                curveTo(16.31f, 1.25f, 17.5f, 2.44f, 17.5f, 5f)
                verticalLineTo(7f)
                curveTo(17.5f, 7.41f, 17.16f, 7.75f, 16.75f, 7.75f)
                close()
                moveTo(8f, 6.25f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                curveTo(16f, 3.3f, 15.45f, 2.75f, 13.75f, 2.75f)
                horizontalLineTo(10.25f)
                curveTo(8.55f, 2.75f, 8f, 3.3f, 8f, 5f)
                verticalLineTo(6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 22.75f)
                horizontalLineTo(11f)
                curveTo(8.96f, 22.75f, 7.66f, 21.77f, 7.33f, 19.99f)
                curveTo(7.26f, 19.58f, 7.52f, 19.19f, 7.93f, 19.12f)
                curveTo(8.33f, 19.04f, 8.73f, 19.31f, 8.8f, 19.72f)
                curveTo(8.93f, 20.43f, 9.3f, 21.25f, 10.99f, 21.25f)
                horizontalLineTo(12.99f)
                curveTo(14.57f, 21.25f, 15.24f, 20.58f, 15.24f, 19f)
                verticalLineTo(15.75f)
                horizontalLineTo(12.96f)
                curveTo(12.55f, 15.75f, 12.21f, 15.41f, 12.21f, 15f)
                curveTo(12.21f, 14.59f, 12.55f, 14.25f, 12.96f, 14.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 14.25f, 16.75f, 14.59f, 16.75f, 15f)
                verticalLineTo(19f)
                curveTo(16.75f, 21.42f, 15.42f, 22.75f, 13f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 18.75f)
                curveTo(3.58f, 18.75f, 2.25f, 17.42f, 2.25f, 15f)
                verticalLineTo(10f)
                curveTo(2.25f, 7.58f, 3.58f, 6.25f, 6f, 6.25f)
                horizontalLineTo(16.59f)
                curveTo(17f, 6.25f, 17.34f, 6.59f, 17.34f, 7f)
                curveTo(17.34f, 7.41f, 17f, 7.75f, 16.59f, 7.75f)
                horizontalLineTo(6f)
                curveTo(4.42f, 7.75f, 3.75f, 8.42f, 3.75f, 10f)
                verticalLineTo(15f)
                curveTo(3.75f, 16.58f, 4.42f, 17.25f, 6f, 17.25f)
                curveTo(6.41f, 17.25f, 6.75f, 17.59f, 6.75f, 18f)
                curveTo(6.75f, 18.41f, 6.41f, 18.75f, 6f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 18.75f)
                horizontalLineTo(16f)
                curveTo(15.59f, 18.75f, 15.25f, 18.41f, 15.25f, 18f)
                verticalLineTo(15.75f)
                horizontalLineTo(13f)
                curveTo(12.59f, 15.75f, 12.25f, 15.41f, 12.25f, 15f)
                curveTo(12.25f, 14.59f, 12.59f, 14.25f, 13f, 14.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 14.25f, 16.75f, 14.59f, 16.75f, 15f)
                verticalLineTo(17.25f)
                horizontalLineTo(18f)
                curveTo(19.58f, 17.25f, 20.25f, 16.58f, 20.25f, 15f)
                verticalLineTo(10f)
                curveTo(20.25f, 9.08f, 20.02f, 8.47f, 19.54f, 8.13f)
                curveTo(19.2f, 7.89f, 19.12f, 7.42f, 19.36f, 7.09f)
                curveTo(19.6f, 6.75f, 20.07f, 6.67f, 20.41f, 6.91f)
                curveTo(21.3f, 7.54f, 21.75f, 8.58f, 21.75f, 10f)
                verticalLineTo(15f)
                curveTo(21.75f, 17.42f, 20.42f, 18.75f, 18f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 15.75f)
                horizontalLineTo(15.79f)
                curveTo(15.38f, 15.75f, 15.04f, 15.41f, 15.04f, 15f)
                curveTo(15.04f, 14.59f, 15.38f, 14.25f, 15.79f, 14.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 14.25f, 17.75f, 14.59f, 17.75f, 15f)
                curveTo(17.75f, 15.41f, 17.41f, 15.75f, 17f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 11.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 11.75f, 6.25f, 11.41f, 6.25f, 11f)
                curveTo(6.25f, 10.59f, 6.59f, 10.25f, 7f, 10.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 10.25f, 9.75f, 10.59f, 9.75f, 11f)
                curveTo(9.75f, 11.41f, 9.41f, 11.75f, 9f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 22.75f)
                curveTo(1.81f, 22.75f, 1.62f, 22.68f, 1.47f, 22.53f)
                curveTo(1.18f, 22.24f, 1.18f, 21.76f, 1.47f, 21.47f)
                lineTo(21.47f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.53f, 1.47f)
                curveTo(22.82f, 1.76f, 22.82f, 2.24f, 22.53f, 2.53f)
                lineTo(2.53f, 22.53f)
                curveTo(2.38f, 22.68f, 2.19f, 22.75f, 2f, 22.75f)
                close()
            }
        }.build()

        return _PrinterSlash!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterSlash: ImageVector? = null
