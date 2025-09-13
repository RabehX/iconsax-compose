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

val Iconsax.Outline.DocumentSketch: ImageVector
    get() {
        if (_DocumentSketch != null) {
            return _DocumentSketch!!
        }
        _DocumentSketch = ImageVector.Builder(
            name = "Outline.DocumentSketch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 1.25f, 14.75f, 1.59f, 14.75f, 2f)
                curveTo(14.75f, 2.41f, 14.41f, 2.75f, 14f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(10f)
                curveTo(21.25f, 9.59f, 21.59f, 9.25f, 22f, 9.25f)
                curveTo(22.41f, 9.25f, 22.75f, 9.59f, 22.75f, 10f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 10.75f)
                horizontalLineTo(18f)
                curveTo(14.58f, 10.75f, 13.25f, 9.42f, 13.25f, 6f)
                verticalLineTo(2f)
                curveTo(13.25f, 1.7f, 13.43f, 1.42f, 13.71f, 1.31f)
                curveTo(13.99f, 1.19f, 14.31f, 1.26f, 14.53f, 1.47f)
                lineTo(22.53f, 9.47f)
                curveTo(22.74f, 9.68f, 22.81f, 10.01f, 22.69f, 10.29f)
                curveTo(22.58f, 10.57f, 22.3f, 10.75f, 22f, 10.75f)
                close()
                moveTo(14.75f, 3.81f)
                verticalLineTo(6f)
                curveTo(14.75f, 8.58f, 15.42f, 9.25f, 18f, 9.25f)
                horizontalLineTo(20.19f)
                lineTo(14.75f, 3.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.651f, 18.71f)
                curveTo(9.211f, 18.71f, 8.791f, 18.54f, 8.481f, 18.23f)
                lineTo(6.021f, 15.77f)
                curveTo(5.481f, 15.23f, 5.391f, 14.32f, 5.811f, 13.68f)
                lineTo(6.941f, 11.98f)
                curveTo(7.221f, 11.55f, 7.801f, 11.24f, 8.321f, 11.24f)
                horizontalLineTo(10.971f)
                curveTo(11.481f, 11.24f, 12.061f, 11.55f, 12.351f, 11.98f)
                lineTo(13.481f, 13.67f)
                curveTo(13.901f, 14.3f, 13.811f, 15.22f, 13.271f, 15.76f)
                lineTo(10.811f, 18.22f)
                curveTo(10.511f, 18.54f, 10.091f, 18.71f, 9.651f, 18.71f)
                close()
                moveTo(8.331f, 12.75f)
                curveTo(8.291f, 12.76f, 8.211f, 12.8f, 8.191f, 12.83f)
                lineTo(7.071f, 14.52f)
                curveTo(7.041f, 14.56f, 7.051f, 14.68f, 7.091f, 14.72f)
                lineTo(9.551f, 17.18f)
                curveTo(9.601f, 17.23f, 9.721f, 17.23f, 9.771f, 17.18f)
                lineTo(12.231f, 14.72f)
                curveTo(12.271f, 14.68f, 12.281f, 14.57f, 12.251f, 14.52f)
                lineTo(11.121f, 12.83f)
                curveTo(11.101f, 12.81f, 11.021f, 12.77f, 10.981f, 12.76f)
                lineTo(8.331f, 12.75f)
                close()
            }
        }.build()

        return _DocumentSketch!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentSketch: ImageVector? = null
