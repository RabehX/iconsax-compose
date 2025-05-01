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


val Iconsax.Filled.Warning2: ImageVector
    get() {
        if (_Warning2 != null) {
            return _Warning2!!
        }
        _Warning2 = ImageVector.Builder(
            name = "Filled.Warning2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.51f, 5.85f)
                lineTo(13.57f, 2.42f)
                curveTo(12.6f, 1.86f, 11.4f, 1.86f, 10.42f, 2.42f)
                lineTo(4.49f, 5.85f)
                curveTo(3.52f, 6.41f, 2.92f, 7.45f, 2.92f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(2.92f, 16.54f, 3.52f, 17.58f, 4.49f, 18.15f)
                lineTo(10.43f, 21.58f)
                curveTo(11.4f, 22.14f, 12.6f, 22.14f, 13.58f, 21.58f)
                lineTo(19.52f, 18.15f)
                curveTo(20.49f, 17.59f, 21.09f, 16.55f, 21.09f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(21.08f, 7.45f, 20.48f, 6.42f, 19.51f, 5.85f)
                close()
                moveTo(11.25f, 7.75f)
                curveTo(11.25f, 7.34f, 11.59f, 7f, 12f, 7f)
                curveTo(12.41f, 7f, 12.75f, 7.34f, 12.75f, 7.75f)
                verticalLineTo(13f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12f, 13.75f)
                curveTo(11.59f, 13.75f, 11.25f, 13.41f, 11.25f, 13f)
                verticalLineTo(7.75f)
                close()
                moveTo(12.92f, 16.63f)
                curveTo(12.87f, 16.75f, 12.8f, 16.86f, 12.71f, 16.96f)
                curveTo(12.52f, 17.15f, 12.27f, 17.25f, 12f, 17.25f)
                curveTo(11.87f, 17.25f, 11.74f, 17.22f, 11.62f, 17.17f)
                curveTo(11.49f, 17.12f, 11.39f, 17.05f, 11.29f, 16.96f)
                curveTo(11.2f, 16.86f, 11.13f, 16.75f, 11.07f, 16.63f)
                curveTo(11.02f, 16.51f, 11f, 16.38f, 11f, 16.25f)
                curveTo(11f, 15.99f, 11.1f, 15.73f, 11.29f, 15.54f)
                curveTo(11.39f, 15.45f, 11.49f, 15.38f, 11.62f, 15.33f)
                curveTo(11.99f, 15.17f, 12.43f, 15.26f, 12.71f, 15.54f)
                curveTo(12.8f, 15.64f, 12.87f, 15.74f, 12.92f, 15.87f)
                curveTo(12.97f, 15.99f, 13f, 16.12f, 13f, 16.25f)
                curveTo(13f, 16.38f, 12.97f, 16.51f, 12.92f, 16.63f)
                close()
            }
        }.build()

        return _Warning2!!
    }

@Suppress("ObjectPropertyName")
private var _Warning2: ImageVector? = null
