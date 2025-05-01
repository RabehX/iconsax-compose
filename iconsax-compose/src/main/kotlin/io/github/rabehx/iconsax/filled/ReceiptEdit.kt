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


val Iconsax.Filled.ReceiptEdit: ImageVector
    get() {
        if (_ReceiptEdit != null) {
            return _ReceiptEdit!!
        }
        _ReceiptEdit = ImageVector.Builder(
            name = "Filled.ReceiptEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.78f, 2f)
                horizontalLineTo(8.22f)
                curveTo(4.44f, 2f, 3.5f, 3.01f, 3.5f, 7.04f)
                verticalLineTo(18.3f)
                curveTo(3.5f, 20.96f, 4.96f, 21.59f, 6.73f, 19.69f)
                lineTo(6.74f, 19.68f)
                curveTo(7.56f, 18.81f, 8.81f, 18.88f, 9.52f, 19.83f)
                lineTo(10.53f, 21.18f)
                curveTo(11.34f, 22.25f, 12.65f, 22.25f, 13.46f, 21.18f)
                lineTo(14.47f, 19.83f)
                curveTo(15.19f, 18.87f, 16.44f, 18.8f, 17.26f, 19.68f)
                curveTo(19.04f, 21.58f, 20.49f, 20.95f, 20.49f, 18.29f)
                verticalLineTo(7.04f)
                curveTo(20.5f, 3.01f, 19.56f, 2f, 15.78f, 2f)
                close()
                moveTo(14.84f, 9.99f)
                lineTo(14.34f, 10.5f)
                horizontalLineTo(14.33f)
                lineTo(11.3f, 13.53f)
                curveTo(11.17f, 13.66f, 10.9f, 13.8f, 10.71f, 13.82f)
                lineTo(9.36f, 14.02f)
                curveTo(8.87f, 14.09f, 8.53f, 13.74f, 8.6f, 13.26f)
                lineTo(8.79f, 11.9f)
                curveTo(8.82f, 11.71f, 8.95f, 11.45f, 9.08f, 11.31f)
                lineTo(12.12f, 8.28f)
                lineTo(12.62f, 7.77f)
                curveTo(12.95f, 7.44f, 13.32f, 7.2f, 13.72f, 7.2f)
                curveTo(14.06f, 7.2f, 14.43f, 7.36f, 14.84f, 7.77f)
                curveTo(15.74f, 8.67f, 15.45f, 9.38f, 14.84f, 9.99f)
                close()
            }
        }.build()

        return _ReceiptEdit!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptEdit: ImageVector? = null
