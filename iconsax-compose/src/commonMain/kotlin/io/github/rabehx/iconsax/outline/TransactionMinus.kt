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

val Iconsax.Outline.TransactionMinus: ImageVector
    get() {
        if (_TransactionMinus != null) {
            return _TransactionMinus!!
        }
        _TransactionMinus = ImageVector.Builder(
            name = "Outline.TransactionMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.219f, 22.75f, 10.46f, 22.35f, 9.94f, 21.65f)
                lineTo(8.93f, 20.3f)
                curveTo(8.72f, 20.02f, 8.44f, 19.86f, 8.14f, 19.84f)
                curveTo(7.84f, 19.83f, 7.54f, 19.96f, 7.3f, 20.21f)
                lineTo(6.75f, 19.7f)
                lineTo(7.3f, 20.21f)
                curveTo(5.86f, 21.75f, 4.75f, 21.63f, 4.22f, 21.42f)
                curveTo(3.68f, 21.21f, 2.77f, 20.52f, 2.77f, 18.3f)
                verticalLineTo(7.04f)
                curveTo(2.77f, 2.6f, 4.05f, 1.25f, 8.24f, 1.25f)
                horizontalLineTo(15.8f)
                curveTo(19.99f, 1.25f, 21.27f, 2.6f, 21.27f, 7.04f)
                verticalLineTo(18.3f)
                curveTo(21.27f, 20.51f, 20.36f, 21.2f, 19.819f, 21.42f)
                curveTo(19.289f, 21.63f, 18.19f, 21.75f, 16.74f, 20.21f)
                curveTo(16.5f, 19.95f, 16.199f, 19.82f, 15.889f, 19.84f)
                curveTo(15.59f, 19.86f, 15.3f, 20.02f, 15.09f, 20.3f)
                lineTo(14.08f, 21.65f)
                curveTo(13.54f, 22.35f, 12.78f, 22.75f, 12f, 22.75f)
                close()
                moveTo(8.08f, 18.33f)
                curveTo(8.12f, 18.33f, 8.17f, 18.33f, 8.21f, 18.33f)
                curveTo(8.95f, 18.37f, 9.65f, 18.76f, 10.12f, 19.39f)
                lineTo(11.13f, 20.74f)
                curveTo(11.62f, 21.39f, 12.37f, 21.39f, 12.859f, 20.74f)
                lineTo(13.87f, 19.39f)
                curveTo(14.349f, 18.76f, 15.04f, 18.37f, 15.79f, 18.33f)
                curveTo(16.539f, 18.29f, 17.27f, 18.6f, 17.809f, 19.18f)
                curveTo(18.569f, 19.99f, 19.059f, 20.09f, 19.24f, 20.02f)
                curveTo(19.479f, 19.92f, 19.74f, 19.34f, 19.74f, 18.3f)
                verticalLineTo(7.04f)
                curveTo(19.74f, 3.43f, 19.11f, 2.75f, 15.769f, 2.75f)
                horizontalLineTo(8.21f)
                curveTo(4.87f, 2.75f, 4.24f, 3.43f, 4.24f, 7.04f)
                verticalLineTo(18.3f)
                curveTo(4.24f, 19.35f, 4.5f, 19.93f, 4.74f, 20.02f)
                curveTo(4.91f, 20.09f, 5.41f, 19.99f, 6.17f, 19.18f)
                curveTo(6.72f, 18.63f, 7.39f, 18.33f, 8.08f, 18.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.75f, 10.75f)
                horizontalLineTo(9.25f)
                curveTo(8.84f, 10.75f, 8.5f, 10.41f, 8.5f, 10f)
                curveTo(8.5f, 9.59f, 8.84f, 9.25f, 9.25f, 9.25f)
                horizontalLineTo(14.75f)
                curveTo(15.16f, 9.25f, 15.5f, 9.59f, 15.5f, 10f)
                curveTo(15.5f, 10.41f, 15.16f, 10.75f, 14.75f, 10.75f)
                close()
            }
        }.build()

        return _TransactionMinus!!
    }

@Suppress("ObjectPropertyName")
private var _TransactionMinus: ImageVector? = null
