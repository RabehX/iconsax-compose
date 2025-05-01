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


val Iconsax.Filled.Ghost: ImageVector
    get() {
        if (_Ghost != null) {
            return _Ghost!!
        }
        _Ghost = ImageVector.Builder(
            name = "Filled.Ghost",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.58f, 2f, 12.18f)
                verticalLineTo(20.07f)
                curveTo(2f, 21.33f, 2.75f, 21.67f, 3.67f, 20.83f)
                lineTo(4.67f, 19.92f)
                curveTo(5.04f, 19.58f, 5.64f, 19.58f, 6.01f, 19.92f)
                lineTo(8.01f, 21.75f)
                curveTo(8.38f, 22.09f, 8.98f, 22.09f, 9.35f, 21.75f)
                lineTo(11.35f, 19.92f)
                curveTo(11.72f, 19.58f, 12.32f, 19.58f, 12.69f, 19.92f)
                lineTo(14.69f, 21.75f)
                curveTo(15.06f, 22.09f, 15.66f, 22.09f, 16.03f, 21.75f)
                lineTo(18.03f, 19.92f)
                curveTo(18.4f, 19.58f, 19f, 19.58f, 19.37f, 19.92f)
                lineTo(20.37f, 20.83f)
                curveTo(21.29f, 21.67f, 22.04f, 21.33f, 22.04f, 20.07f)
                verticalLineTo(12.18f)
                curveTo(22f, 6.58f, 17.5f, 2f, 12f, 2f)
                close()
                moveTo(12f, 6.62f)
                curveTo(13.31f, 6.62f, 14.38f, 7.69f, 14.38f, 9f)
                curveTo(14.38f, 10.31f, 13.31f, 11.38f, 12f, 11.38f)
                curveTo(10.69f, 11.38f, 9.62f, 10.31f, 9.62f, 9f)
                curveTo(9.62f, 7.69f, 10.69f, 6.62f, 12f, 6.62f)
                close()
                moveTo(16.45f, 14.6f)
                curveTo(15.14f, 15.58f, 13.57f, 16.07f, 12f, 16.07f)
                curveTo(10.43f, 16.07f, 8.86f, 15.58f, 7.55f, 14.6f)
                curveTo(7.22f, 14.35f, 7.15f, 13.88f, 7.4f, 13.55f)
                curveTo(7.65f, 13.22f, 8.12f, 13.15f, 8.45f, 13.4f)
                curveTo(10.54f, 14.97f, 13.46f, 14.97f, 15.55f, 13.4f)
                curveTo(15.88f, 13.15f, 16.35f, 13.22f, 16.6f, 13.55f)
                curveTo(16.85f, 13.88f, 16.78f, 14.35f, 16.45f, 14.6f)
                close()
            }
        }.build()

        return _Ghost!!
    }

@Suppress("ObjectPropertyName")
private var _Ghost: ImageVector? = null
