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


val Iconsax.Filled.ReceiptMinus: ImageVector
    get() {
        if (_ReceiptMinus != null) {
            return _ReceiptMinus!!
        }
        _ReceiptMinus = ImageVector.Builder(
            name = "Filled.ReceiptMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 2f)
                horizontalLineTo(6f)
                curveTo(3f, 2f, 2f, 3.79f, 2f, 6f)
                verticalLineTo(7f)
                verticalLineTo(21f)
                curveTo(2f, 21.83f, 2.94f, 22.3f, 3.6f, 21.8f)
                lineTo(5.31f, 20.52f)
                curveTo(5.71f, 20.22f, 6.27f, 20.26f, 6.63f, 20.62f)
                lineTo(8.29f, 22.29f)
                curveTo(8.68f, 22.68f, 9.32f, 22.68f, 9.71f, 22.29f)
                lineTo(11.39f, 20.61f)
                curveTo(11.74f, 20.26f, 12.3f, 20.22f, 12.69f, 20.52f)
                lineTo(14.4f, 21.8f)
                curveTo(15.06f, 22.29f, 16f, 21.82f, 16f, 21f)
                verticalLineTo(4f)
                curveTo(16f, 2.9f, 16.9f, 2f, 18f, 2f)
                horizontalLineTo(7f)
                close()
                moveTo(11.75f, 10.75f)
                horizontalLineTo(6.25f)
                curveTo(5.84f, 10.75f, 5.5f, 10.41f, 5.5f, 10f)
                curveTo(5.5f, 9.59f, 5.84f, 9.25f, 6.25f, 9.25f)
                horizontalLineTo(11.75f)
                curveTo(12.16f, 9.25f, 12.5f, 9.59f, 12.5f, 10f)
                curveTo(12.5f, 10.41f, 12.16f, 10.75f, 11.75f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.01f, 2f)
                verticalLineTo(3.5f)
                curveTo(18.67f, 3.5f, 19.3f, 3.77f, 19.76f, 4.22f)
                curveTo(20.24f, 4.71f, 20.5f, 5.34f, 20.5f, 6f)
                verticalLineTo(8.42f)
                curveTo(20.5f, 9.16f, 20.17f, 9.5f, 19.42f, 9.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(4.01f)
                curveTo(17.5f, 3.73f, 17.73f, 3.5f, 18.01f, 3.5f)
                verticalLineTo(2f)
                close()
                moveTo(18.01f, 2f)
                curveTo(16.9f, 2f, 16f, 2.9f, 16f, 4.01f)
                verticalLineTo(11f)
                horizontalLineTo(19.42f)
                curveTo(21f, 11f, 22f, 10f, 22f, 8.42f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.55f, 3.9f, 20.83f, 3.17f)
                curveTo(20.1f, 2.45f, 19.11f, 2.01f, 18.01f, 2f)
                curveTo(18.02f, 2f, 18.01f, 2f, 18.01f, 2f)
                close()
            }
        }.build()

        return _ReceiptMinus!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptMinus: ImageVector? = null
