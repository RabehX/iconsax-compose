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


val Iconsax.Filled.ReceiptDisscount: ImageVector
    get() {
        if (_ReceiptDisscount != null) {
            return _ReceiptDisscount!!
        }
        _ReceiptDisscount = ImageVector.Builder(
            name = "Filled.ReceiptDisscount",
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
                moveTo(9f, 7f)
                curveTo(9.55f, 7f, 10f, 7.45f, 10f, 8f)
                curveTo(10f, 8.55f, 9.56f, 9f, 9f, 9f)
                curveTo(8.44f, 9f, 8f, 8.55f, 8f, 8f)
                curveTo(8f, 7.45f, 8.44f, 7f, 9f, 7f)
                close()
                moveTo(15f, 14f)
                curveTo(14.44f, 14f, 14f, 13.55f, 14f, 13f)
                curveTo(14f, 12.45f, 14.45f, 12f, 15f, 12f)
                curveTo(15.55f, 12f, 16f, 12.45f, 16f, 13f)
                curveTo(16f, 13.55f, 15.56f, 14f, 15f, 14f)
                close()
                moveTo(15.9f, 7.59f)
                lineTo(9.17f, 14.32f)
                curveTo(9.02f, 14.47f, 8.83f, 14.54f, 8.64f, 14.54f)
                curveTo(8.45f, 14.54f, 8.26f, 14.47f, 8.11f, 14.32f)
                curveTo(7.82f, 14.03f, 7.82f, 13.55f, 8.11f, 13.26f)
                lineTo(14.84f, 6.53f)
                curveTo(15.13f, 6.24f, 15.61f, 6.24f, 15.9f, 6.53f)
                curveTo(16.19f, 6.82f, 16.19f, 7.3f, 15.9f, 7.59f)
                close()
            }
        }.build()

        return _ReceiptDisscount!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptDisscount: ImageVector? = null
