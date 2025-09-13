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


val Iconsax.Filled.PenTool2: ImageVector
    get() {
        if (_PenTool2 != null) {
            return _PenTool2!!
        }
        _PenTool2 = ImageVector.Builder(
            name = "Filled.PenTool2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.979f, 10.7f)
                curveTo(20.76f, 6.8f, 17.869f, 3.55f, 14.009f, 2.89f)
                curveTo(13.95f, 2.12f, 13.309f, 1.5f, 12.519f, 1.5f)
                horizontalLineTo(11.519f)
                curveTo(10.729f, 1.5f, 10.099f, 2.11f, 10.03f, 2.88f)
                curveTo(6.15f, 3.52f, 3.24f, 6.78f, 3.02f, 10.7f)
                curveTo(2.31f, 10.82f, 1.77f, 11.43f, 1.77f, 12.17f)
                verticalLineTo(13.17f)
                curveTo(1.77f, 14f, 2.44f, 14.67f, 3.27f, 14.67f)
                horizontalLineTo(4.27f)
                curveTo(5.1f, 14.67f, 5.77f, 14f, 5.77f, 13.17f)
                verticalLineTo(12.17f)
                curveTo(5.77f, 11.43f, 5.23f, 10.82f, 4.52f, 10.7f)
                curveTo(4.73f, 7.58f, 7.02f, 4.99f, 10.08f, 4.39f)
                curveTo(10.25f, 5.03f, 10.83f, 5.5f, 11.519f, 5.5f)
                horizontalLineTo(12.519f)
                curveTo(13.21f, 5.5f, 13.78f, 5.03f, 13.96f, 4.4f)
                curveTo(17f, 5.01f, 19.27f, 7.6f, 19.479f, 10.7f)
                curveTo(18.77f, 10.82f, 18.229f, 11.43f, 18.229f, 12.17f)
                verticalLineTo(13.17f)
                curveTo(18.229f, 14f, 18.899f, 14.67f, 19.729f, 14.67f)
                horizontalLineTo(20.729f)
                curveTo(21.559f, 14.67f, 22.229f, 14f, 22.229f, 13.17f)
                verticalLineTo(12.17f)
                curveTo(22.229f, 11.43f, 21.69f, 10.81f, 20.979f, 10.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.77f, 16.549f)
                lineTo(14.13f, 17.999f)
                horizontalLineTo(9.88f)
                lineTo(8.24f, 16.549f)
                curveTo(7.29f, 15.769f, 7.29f, 15.169f, 8.01f, 14.249f)
                lineTo(10.9f, 10.589f)
                curveTo(11.1f, 10.339f, 11.33f, 10.169f, 11.59f, 10.079f)
                curveTo(11.86f, 9.989f, 12.15f, 9.989f, 12.43f, 10.079f)
                curveTo(12.68f, 10.169f, 12.91f, 10.339f, 13.12f, 10.589f)
                lineTo(16f, 14.239f)
                curveTo(16.73f, 15.159f, 16.69f, 15.729f, 15.77f, 16.549f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.32f, 22f)
                horizontalLineTo(10.73f)
                curveTo(9.81f, 22f, 9.12f, 21.25f, 9.3f, 20.45f)
                lineTo(9.61f, 19.06f)
                curveTo(9.67f, 18.78f, 9.92f, 18.59f, 10.2f, 18.59f)
                horizontalLineTo(13.85f)
                curveTo(14.13f, 18.59f, 14.37f, 18.78f, 14.44f, 19.06f)
                lineTo(14.75f, 20.45f)
                curveTo(14.94f, 21.3f, 14.3f, 22f, 13.32f, 22f)
                close()
            }
        }.build()

        return _PenTool2!!
    }

@Suppress("ObjectPropertyName")
private var _PenTool2: ImageVector? = null
