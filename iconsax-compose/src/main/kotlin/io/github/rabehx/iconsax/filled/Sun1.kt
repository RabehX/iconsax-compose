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


val Iconsax.Filled.Sun1: ImageVector
    get() {
        if (_Sun1 != null) {
            return _Sun1!!
        }
        _Sun1 = ImageVector.Builder(
            name = "Filled.Sun1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19f)
                curveTo(15.866f, 19f, 19f, 15.866f, 19f, 12f)
                curveTo(19f, 8.134f, 15.866f, 5f, 12f, 5f)
                curveTo(8.134f, 5f, 5f, 8.134f, 5f, 12f)
                curveTo(5f, 15.866f, 8.134f, 19f, 12f, 19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.96f)
                curveTo(11.45f, 22.96f, 11f, 22.55f, 11f, 22f)
                verticalLineTo(21.92f)
                curveTo(11f, 21.37f, 11.45f, 20.92f, 12f, 20.92f)
                curveTo(12.55f, 20.92f, 13f, 21.37f, 13f, 21.92f)
                curveTo(13f, 22.47f, 12.55f, 22.96f, 12f, 22.96f)
                close()
                moveTo(19.14f, 20.14f)
                curveTo(18.88f, 20.14f, 18.63f, 20.04f, 18.43f, 19.85f)
                lineTo(18.3f, 19.72f)
                curveTo(17.91f, 19.33f, 17.91f, 18.7f, 18.3f, 18.31f)
                curveTo(18.69f, 17.92f, 19.32f, 17.92f, 19.71f, 18.31f)
                lineTo(19.84f, 18.44f)
                curveTo(20.23f, 18.83f, 20.23f, 19.46f, 19.84f, 19.85f)
                curveTo(19.65f, 20.04f, 19.4f, 20.14f, 19.14f, 20.14f)
                close()
                moveTo(4.86f, 20.14f)
                curveTo(4.6f, 20.14f, 4.35f, 20.04f, 4.15f, 19.85f)
                curveTo(3.76f, 19.46f, 3.76f, 18.83f, 4.15f, 18.44f)
                lineTo(4.28f, 18.31f)
                curveTo(4.67f, 17.92f, 5.3f, 17.92f, 5.69f, 18.31f)
                curveTo(6.08f, 18.7f, 6.08f, 19.33f, 5.69f, 19.72f)
                lineTo(5.56f, 19.85f)
                curveTo(5.37f, 20.04f, 5.11f, 20.14f, 4.86f, 20.14f)
                close()
                moveTo(22f, 13f)
                horizontalLineTo(21.92f)
                curveTo(21.37f, 13f, 20.92f, 12.55f, 20.92f, 12f)
                curveTo(20.92f, 11.45f, 21.37f, 11f, 21.92f, 11f)
                curveTo(22.47f, 11f, 22.96f, 11.45f, 22.96f, 12f)
                curveTo(22.96f, 12.55f, 22.55f, 13f, 22f, 13f)
                close()
                moveTo(2.08f, 13f)
                horizontalLineTo(2f)
                curveTo(1.45f, 13f, 1f, 12.55f, 1f, 12f)
                curveTo(1f, 11.45f, 1.45f, 11f, 2f, 11f)
                curveTo(2.55f, 11f, 3.04f, 11.45f, 3.04f, 12f)
                curveTo(3.04f, 12.55f, 2.63f, 13f, 2.08f, 13f)
                close()
                moveTo(19.01f, 5.99f)
                curveTo(18.75f, 5.99f, 18.5f, 5.89f, 18.3f, 5.7f)
                curveTo(17.91f, 5.31f, 17.91f, 4.68f, 18.3f, 4.29f)
                lineTo(18.43f, 4.16f)
                curveTo(18.82f, 3.77f, 19.45f, 3.77f, 19.84f, 4.16f)
                curveTo(20.23f, 4.55f, 20.23f, 5.18f, 19.84f, 5.57f)
                lineTo(19.71f, 5.7f)
                curveTo(19.52f, 5.89f, 19.27f, 5.99f, 19.01f, 5.99f)
                close()
                moveTo(4.99f, 5.99f)
                curveTo(4.73f, 5.99f, 4.48f, 5.89f, 4.28f, 5.7f)
                lineTo(4.15f, 5.56f)
                curveTo(3.76f, 5.17f, 3.76f, 4.54f, 4.15f, 4.15f)
                curveTo(4.54f, 3.76f, 5.17f, 3.76f, 5.56f, 4.15f)
                lineTo(5.69f, 4.28f)
                curveTo(6.08f, 4.67f, 6.08f, 5.3f, 5.69f, 5.69f)
                curveTo(5.5f, 5.89f, 5.24f, 5.99f, 4.99f, 5.99f)
                close()
                moveTo(12f, 3.04f)
                curveTo(11.45f, 3.04f, 11f, 2.63f, 11f, 2.08f)
                verticalLineTo(2f)
                curveTo(11f, 1.45f, 11.45f, 1f, 12f, 1f)
                curveTo(12.55f, 1f, 13f, 1.45f, 13f, 2f)
                curveTo(13f, 2.55f, 12.55f, 3.04f, 12f, 3.04f)
                close()
            }
        }.build()

        return _Sun1!!
    }

@Suppress("ObjectPropertyName")
private var _Sun1: ImageVector? = null
