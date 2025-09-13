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


val Iconsax.Filled.ReceiptSearch: ImageVector
    get() {
        if (_ReceiptSearch != null) {
            return _ReceiptSearch!!
        }
        _ReceiptSearch = ImageVector.Builder(
            name = "Filled.ReceiptSearch",
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
                moveTo(15.66f, 14.53f)
                curveTo(15.51f, 14.68f, 15.32f, 14.75f, 15.13f, 14.75f)
                curveTo(14.94f, 14.75f, 14.75f, 14.68f, 14.6f, 14.53f)
                lineTo(13.86f, 13.79f)
                curveTo(13.28f, 14.17f, 12.58f, 14.4f, 11.83f, 14.4f)
                curveTo(9.79f, 14.4f, 8.13f, 12.74f, 8.13f, 10.7f)
                curveTo(8.13f, 8.66f, 9.78f, 7f, 11.83f, 7f)
                curveTo(13.88f, 7f, 15.53f, 8.66f, 15.53f, 10.7f)
                curveTo(15.53f, 11.45f, 15.3f, 12.15f, 14.92f, 12.73f)
                lineTo(15.66f, 13.47f)
                curveTo(15.95f, 13.76f, 15.95f, 14.24f, 15.66f, 14.53f)
                close()
            }
        }.build()

        return _ReceiptSearch!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptSearch: ImageVector? = null
