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


val Iconsax.Filled.DocumentSketch: ImageVector
    get() {
        if (_DocumentSketch != null) {
            return _DocumentSketch!!
        }
        _DocumentSketch = ImageVector.Builder(
            name = "Filled.DocumentSketch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 10.19f)
                horizontalLineTo(17.61f)
                curveTo(15.24f, 10.19f, 13.31f, 8.26f, 13.31f, 5.89f)
                verticalLineTo(3f)
                curveTo(13.31f, 2.45f, 12.86f, 2f, 12.31f, 2f)
                horizontalLineTo(8.07f)
                curveTo(4.99f, 2f, 2.5f, 4f, 2.5f, 7.57f)
                verticalLineTo(16.43f)
                curveTo(2.5f, 20f, 4.99f, 22f, 8.07f, 22f)
                horizontalLineTo(15.93f)
                curveTo(19.01f, 22f, 21.5f, 20f, 21.5f, 16.43f)
                verticalLineTo(11.19f)
                curveTo(21.5f, 10.64f, 21.05f, 10.19f, 20.5f, 10.19f)
                close()
                moveTo(12.4f, 15.58f)
                lineTo(10.54f, 17.44f)
                curveTo(10.31f, 17.67f, 9.99f, 17.8f, 9.65f, 17.8f)
                curveTo(9.31f, 17.8f, 9f, 17.67f, 8.76f, 17.44f)
                lineTo(6.9f, 15.58f)
                curveTo(6.49f, 15.17f, 6.42f, 14.48f, 6.75f, 14f)
                lineTo(7.6f, 12.72f)
                curveTo(7.81f, 12.39f, 8.25f, 12.16f, 8.64f, 12.16f)
                horizontalLineTo(10.65f)
                curveTo(11.04f, 12.16f, 11.47f, 12.39f, 11.69f, 12.72f)
                lineTo(12.55f, 14f)
                curveTo(12.86f, 14.48f, 12.8f, 15.17f, 12.4f, 15.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.43f, 8.81f)
                curveTo(18.38f, 8.82f, 19.7f, 8.82f, 20.83f, 8.82f)
                curveTo(21.4f, 8.82f, 21.7f, 8.15f, 21.3f, 7.75f)
                curveTo(19.86f, 6.3f, 17.28f, 3.69f, 15.8f, 2.21f)
                curveTo(15.39f, 1.8f, 14.68f, 2.08f, 14.68f, 2.65f)
                verticalLineTo(6.14f)
                curveTo(14.68f, 7.6f, 15.92f, 8.81f, 17.43f, 8.81f)
                close()
            }
        }.build()

        return _DocumentSketch!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentSketch: ImageVector? = null
