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

val Iconsax.Outline.ReceiptSquare: ImageVector
    get() {
        if (_ReceiptSquare != null) {
            return _ReceiptSquare!!
        }
        _ReceiptSquare = ImageVector.Builder(
            name = "Outline.ReceiptSquare",
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
                moveTo(12f, 18.63f)
                curveTo(11.44f, 18.63f, 10.91f, 18.35f, 10.54f, 17.86f)
                lineTo(9.94f, 17.06f)
                curveTo(9.87f, 16.97f, 9.79f, 16.92f, 9.7f, 16.91f)
                curveTo(9.61f, 16.91f, 9.53f, 16.95f, 9.45f, 17.03f)
                lineTo(8.9f, 16.52f)
                lineTo(9.45f, 17.03f)
                curveTo(8.48f, 18.07f, 7.69f, 17.97f, 7.3f, 17.82f)
                curveTo(6.91f, 17.66f, 6.25f, 17.18f, 6.25f, 15.7f)
                verticalLineTo(9.07f)
                curveTo(6.25f, 6.29f, 7.14f, 5.36f, 9.78f, 5.36f)
                horizontalLineTo(14.23f)
                curveTo(16.87f, 5.36f, 17.76f, 6.3f, 17.76f, 9.07f)
                verticalLineTo(15.7f)
                curveTo(17.76f, 17.18f, 17.1f, 17.67f, 16.71f, 17.82f)
                curveTo(16.33f, 17.97f, 15.54f, 18.07f, 14.56f, 17.03f)
                curveTo(14.48f, 16.95f, 14.39f, 16.91f, 14.3f, 16.91f)
                curveTo(14.21f, 16.91f, 14.13f, 16.97f, 14.06f, 17.06f)
                lineTo(13.47f, 17.85f)
                curveTo(13.09f, 18.35f, 12.56f, 18.63f, 12f, 18.63f)
                close()
                moveTo(9.69f, 15.41f)
                curveTo(9.72f, 15.41f, 9.75f, 15.41f, 9.78f, 15.41f)
                curveTo(10.31f, 15.44f, 10.8f, 15.71f, 11.13f, 16.16f)
                lineTo(11.73f, 16.96f)
                curveTo(11.9f, 17.18f, 12.09f, 17.18f, 12.25f, 16.96f)
                lineTo(12.84f, 16.17f)
                curveTo(13.17f, 15.72f, 13.67f, 15.45f, 14.2f, 15.42f)
                curveTo(14.72f, 15.38f, 15.25f, 15.61f, 15.63f, 16.02f)
                curveTo(15.91f, 16.32f, 16.09f, 16.4f, 16.16f, 16.42f)
                curveTo(16.15f, 16.37f, 16.24f, 16.17f, 16.24f, 15.71f)
                verticalLineTo(9.08f)
                curveTo(16.24f, 7.03f, 15.93f, 6.87f, 14.21f, 6.87f)
                horizontalLineTo(9.76f)
                curveTo(8.04f, 6.87f, 7.73f, 7.03f, 7.73f, 9.08f)
                verticalLineTo(15.71f)
                curveTo(7.73f, 16.17f, 7.82f, 16.37f, 7.85f, 16.43f)
                curveTo(7.88f, 16.39f, 8.06f, 16.31f, 8.33f, 16.01f)
                curveTo(8.33f, 16f, 8.34f, 16f, 8.35f, 15.99f)
                curveTo(8.72f, 15.63f, 9.2f, 15.41f, 9.69f, 15.41f)
                close()
            }
        }.build()

        return _ReceiptSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptSquare: ImageVector? = null
