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


val Iconsax.Filled.SendSqaure2: ImageVector
    get() {
        if (_SendSqaure2 != null) {
            return _SendSqaure2!!
        }
        _SendSqaure2 = ImageVector.Builder(
            name = "Filled.SendSqaure2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(8.64f, 12.81f)
                lineTo(13.02f, 8.43f)
                horizontalLineTo(10.59f)
                curveTo(10.18f, 8.43f, 9.84f, 8.09f, 9.84f, 7.68f)
                curveTo(9.84f, 7.27f, 10.18f, 6.93f, 10.59f, 6.93f)
                horizontalLineTo(14.83f)
                curveTo(14.93f, 6.93f, 15.02f, 6.95f, 15.12f, 6.99f)
                curveTo(15.3f, 7.07f, 15.45f, 7.21f, 15.53f, 7.4f)
                curveTo(15.57f, 7.49f, 15.59f, 7.59f, 15.59f, 7.69f)
                verticalLineTo(11.93f)
                curveTo(15.59f, 12.34f, 15.25f, 12.68f, 14.84f, 12.68f)
                curveTo(14.43f, 12.68f, 14.09f, 12.34f, 14.09f, 11.93f)
                verticalLineTo(9.5f)
                lineTo(9.7f, 13.87f)
                curveTo(9.55f, 14.02f, 9.36f, 14.09f, 9.17f, 14.09f)
                curveTo(8.98f, 14.09f, 8.79f, 14.02f, 8.64f, 13.87f)
                curveTo(8.35f, 13.58f, 8.35f, 13.1f, 8.64f, 12.81f)
                close()
                moveTo(18.24f, 17.22f)
                curveTo(16.23f, 17.89f, 14.12f, 18.23f, 12f, 18.23f)
                curveTo(9.88f, 18.23f, 7.77f, 17.89f, 5.76f, 17.22f)
                curveTo(5.37f, 17.09f, 5.16f, 16.66f, 5.29f, 16.27f)
                curveTo(5.42f, 15.88f, 5.84f, 15.66f, 6.24f, 15.8f)
                curveTo(9.96f, 17.04f, 14.05f, 17.04f, 17.77f, 15.8f)
                curveTo(18.16f, 15.67f, 18.59f, 15.88f, 18.72f, 16.27f)
                curveTo(18.84f, 16.67f, 18.63f, 17.09f, 18.24f, 17.22f)
                close()
            }
        }.build()

        return _SendSqaure2!!
    }

@Suppress("ObjectPropertyName")
private var _SendSqaure2: ImageVector? = null
