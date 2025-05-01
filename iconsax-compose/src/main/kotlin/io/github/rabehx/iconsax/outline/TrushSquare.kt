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

val Iconsax.Outline.TrushSquare: ImageVector
    get() {
        if (_TrushSquare != null) {
            return _TrushSquare!!
        }
        _TrushSquare = ImageVector.Builder(
            name = "Outline.TrushSquare",
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
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.899f, 9.8f)
                curveTo(17.879f, 9.8f, 17.849f, 9.8f, 17.829f, 9.8f)
                curveTo(14.369f, 9.46f, 10.929f, 9.32f, 7.519f, 9.67f)
                lineTo(6.179f, 9.8f)
                curveTo(5.759f, 9.84f, 5.399f, 9.54f, 5.359f, 9.13f)
                curveTo(5.319f, 8.72f, 5.619f, 8.35f, 6.029f, 8.31f)
                lineTo(7.369f, 8.18f)
                curveTo(10.879f, 7.83f, 14.419f, 7.96f, 17.979f, 8.31f)
                curveTo(18.389f, 8.35f, 18.689f, 8.72f, 18.649f, 9.13f)
                curveTo(18.609f, 9.51f, 18.279f, 9.8f, 17.899f, 9.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.29f, 9.14f)
                curveTo(13.929f, 9.14f, 13.609f, 8.88f, 13.55f, 8.52f)
                lineTo(13.41f, 7.67f)
                curveTo(13.389f, 7.53f, 13.349f, 7.31f, 13.309f, 7.26f)
                curveTo(13.309f, 7.26f, 13.21f, 7.2f, 12.849f, 7.2f)
                horizontalLineTo(11.13f)
                curveTo(10.759f, 7.2f, 10.66f, 7.26f, 10.66f, 7.26f)
                curveTo(10.639f, 7.3f, 10.599f, 7.52f, 10.58f, 7.66f)
                lineTo(10.439f, 8.52f)
                curveTo(10.37f, 8.93f, 9.979f, 9.2f, 9.58f, 9.14f)
                curveTo(9.17f, 9.07f, 8.899f, 8.68f, 8.96f, 8.28f)
                lineTo(9.099f, 7.42f)
                curveTo(9.21f, 6.78f, 9.389f, 5.71f, 11.13f, 5.71f)
                horizontalLineTo(12.849f)
                curveTo(14.599f, 5.71f, 14.78f, 6.83f, 14.88f, 7.43f)
                lineTo(15.019f, 8.28f)
                curveTo(15.09f, 8.69f, 14.809f, 9.08f, 14.41f, 9.14f)
                curveTo(14.38f, 9.14f, 14.33f, 9.14f, 14.29f, 9.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.1f, 18.31f)
                horizontalLineTo(9.89f)
                curveTo(7.36f, 18.31f, 7.25f, 16.79f, 7.18f, 15.78f)
                lineTo(6.75f, 9.17f)
                curveTo(6.72f, 8.76f, 7.04f, 8.4f, 7.45f, 8.37f)
                curveTo(7.87f, 8.34f, 8.22f, 8.66f, 8.25f, 9.07f)
                lineTo(8.68f, 15.67f)
                curveTo(8.75f, 16.65f, 8.76f, 16.8f, 9.89f, 16.8f)
                horizontalLineTo(14.1f)
                curveTo(15.23f, 16.8f, 15.24f, 16.65f, 15.31f, 15.67f)
                lineTo(15.74f, 9.07f)
                curveTo(15.77f, 8.66f, 16.11f, 8.34f, 16.54f, 8.37f)
                curveTo(16.95f, 8.4f, 17.27f, 8.75f, 17.24f, 9.17f)
                lineTo(16.81f, 15.77f)
                curveTo(16.74f, 16.79f, 16.64f, 18.31f, 14.1f, 18.31f)
                close()
            }
        }.build()

        return _TrushSquare!!
    }

@Suppress("ObjectPropertyName")
private var _TrushSquare: ImageVector? = null
