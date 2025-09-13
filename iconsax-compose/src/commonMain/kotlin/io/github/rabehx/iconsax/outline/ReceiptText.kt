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

val Iconsax.Outline.ReceiptText: ImageVector
    get() {
        if (_ReceiptText != null) {
            return _ReceiptText!!
        }
        _ReceiptText = ImageVector.Builder(
            name = "Outline.ReceiptText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.42f, 11.75f)
                horizontalLineTo(16f)
                curveTo(15.59f, 11.75f, 15.25f, 11.41f, 15.25f, 11f)
                verticalLineTo(4.01f)
                curveTo(15.25f, 3.27f, 15.54f, 2.58f, 16.06f, 2.06f)
                curveTo(16.58f, 1.54f, 17.27f, 1.25f, 18.01f, 1.25f)
                horizontalLineTo(18.02f)
                curveTo(19.27f, 1.26f, 20.45f, 1.75f, 21.35f, 2.64f)
                curveTo(22.25f, 3.55f, 22.74f, 4.75f, 22.74f, 6f)
                verticalLineTo(8.42f)
                curveTo(22.75f, 10.41f, 21.41f, 11.75f, 19.42f, 11.75f)
                close()
                moveTo(16.75f, 10.25f)
                horizontalLineTo(19.42f)
                curveTo(20.58f, 10.25f, 21.25f, 9.58f, 21.25f, 8.42f)
                verticalLineTo(6f)
                curveTo(21.25f, 5.14f, 20.91f, 4.32f, 20.3f, 3.7f)
                curveTo(19.69f, 3.1f, 18.88f, 2.76f, 18.02f, 2.75f)
                curveTo(18.02f, 2.75f, 18.02f, 2.75f, 18.01f, 2.75f)
                curveTo(17.68f, 2.75f, 17.36f, 2.88f, 17.12f, 3.12f)
                curveTo(16.88f, 3.36f, 16.75f, 3.67f, 16.75f, 4.01f)
                verticalLineTo(10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 23.33f)
                curveTo(8.53f, 23.33f, 8.09f, 23.15f, 7.76f, 22.81f)
                lineTo(6.1f, 21.14f)
                curveTo(6.01f, 21.05f, 5.87f, 21.04f, 5.77f, 21.12f)
                lineTo(4.06f, 22.4f)
                curveTo(3.53f, 22.8f, 2.83f, 22.87f, 2.23f, 22.57f)
                curveTo(1.63f, 22.27f, 1.26f, 21.67f, 1.26f, 21f)
                verticalLineTo(6f)
                curveTo(1.26f, 2.98f, 2.99f, 1.25f, 6.01f, 1.25f)
                horizontalLineTo(18.01f)
                curveTo(18.42f, 1.25f, 18.76f, 1.59f, 18.76f, 2f)
                curveTo(18.76f, 2.41f, 18.42f, 2.75f, 18.01f, 2.75f)
                curveTo(17.32f, 2.75f, 16.76f, 3.31f, 16.76f, 4f)
                verticalLineTo(21f)
                curveTo(16.76f, 21.67f, 16.39f, 22.27f, 15.79f, 22.57f)
                curveTo(15.2f, 22.87f, 14.49f, 22.8f, 13.96f, 22.4f)
                lineTo(12.25f, 21.12f)
                curveTo(12.15f, 21.04f, 12.01f, 21.06f, 11.93f, 21.14f)
                lineTo(10.25f, 22.82f)
                curveTo(9.91f, 23.15f, 9.47f, 23.33f, 9f, 23.33f)
                close()
                moveTo(5.91f, 19.57f)
                curveTo(6.37f, 19.57f, 6.82f, 19.74f, 7.16f, 20.09f)
                lineTo(8.82f, 21.76f)
                curveTo(8.88f, 21.82f, 8.96f, 21.83f, 9f, 21.83f)
                curveTo(9.04f, 21.83f, 9.12f, 21.82f, 9.18f, 21.76f)
                lineTo(10.86f, 20.08f)
                curveTo(11.48f, 19.46f, 12.46f, 19.4f, 13.15f, 19.93f)
                lineTo(14.85f, 21.2f)
                curveTo(14.96f, 21.28f, 15.06f, 21.25f, 15.11f, 21.22f)
                curveTo(15.16f, 21.19f, 15.25f, 21.13f, 15.25f, 21f)
                verticalLineTo(4f)
                curveTo(15.25f, 3.55f, 15.36f, 3.12f, 15.55f, 2.75f)
                horizontalLineTo(6f)
                curveTo(3.78f, 2.75f, 2.75f, 3.78f, 2.75f, 6f)
                verticalLineTo(21f)
                curveTo(2.75f, 21.14f, 2.84f, 21.2f, 2.89f, 21.23f)
                curveTo(2.95f, 21.26f, 3.05f, 21.28f, 3.15f, 21.2f)
                lineTo(4.86f, 19.92f)
                curveTo(5.17f, 19.69f, 5.54f, 19.57f, 5.91f, 19.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 9.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 9.75f, 5.25f, 9.41f, 5.25f, 9f)
                curveTo(5.25f, 8.59f, 5.59f, 8.25f, 6f, 8.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 8.25f, 12.75f, 8.59f, 12.75f, 9f)
                curveTo(12.75f, 9.41f, 12.41f, 9.75f, 12f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.25f, 13.75f)
                horizontalLineTo(6.75f)
                curveTo(6.34f, 13.75f, 6f, 13.41f, 6f, 13f)
                curveTo(6f, 12.59f, 6.34f, 12.25f, 6.75f, 12.25f)
                horizontalLineTo(11.25f)
                curveTo(11.66f, 12.25f, 12f, 12.59f, 12f, 13f)
                curveTo(12f, 13.41f, 11.66f, 13.75f, 11.25f, 13.75f)
                close()
            }
        }.build()

        return _ReceiptText!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptText: ImageVector? = null
